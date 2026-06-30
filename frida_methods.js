Java.perform(function() {
    var classes = [
        "com.tencent.mm.ui.contact.SelectContactUI",
        "com.tencent.mm.feature.forward.ui.ForwardMsgPreviewUI",
        "com.tencent.mm.pluginsdk.ui.chat.ChatFooter",
        "com.tencent.mm.pluginsdk.ui.MultiSelectContactView",
        "com.tencent.mm.feature.forward.preview.BaseForwardMsgPreviewUIC"
    ];
    
    classes.forEach(function(clsName) {
        try {
            var clz = Java.use(clsName);
            var methods = clz.class.getDeclaredMethods();
            console.log("\n=== " + clsName + " (" + methods.length + " methods) ===");
            methods.forEach(function(m) {
                var ret = m.getReturnType().getName();
                if (ret.startsWith("boolean") || ret.startsWith("int") || ret.startsWith("long") || m.getName().length < 4) {
                    var ptypes = m.getParameterTypes();
                    var params = [];
                    for (var i = 0; i < ptypes.length; i++) params.push(ptypes[i].getName());
                    console.log("  " + m.getName() + "(" + params.join(",") + ") -> " + ret);
                }
            });
        } catch(e) {
            console.log(clsName + ": " + e.message);
        }
    });
});
