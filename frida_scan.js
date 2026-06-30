Java.perform(function() {
    var targets = ["forward", "transmit", "selectcontact", "retransmit", "multiselectcontact", "recorddetail"];
    var found = [];
    
    Java.enumerateLoadedClasses({
        onMatch: function(cls) {
            var lower = cls.toLowerCase();
            for (var i = 0; i < targets.length; i++) {
                if (lower.indexOf(targets[i]) !== -1 && lower.indexOf("tencent.mm") !== -1) {
                    found.push(cls);
                    break;
                }
            }
        },
        onComplete: function() {
            found.sort();
            found.forEach(function(c) { console.log(c); });
        }
    });
});
