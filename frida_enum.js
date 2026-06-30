Java.perform(function() {
    console.log("[*] Starting class enumeration...");
    
    var targets = ["forward", "transmit", "selectcontact", "retransmit", "multiselectcontact", "recorddetail"];
    var found = [];
    
    Java.enumerateLoadedClasses({
        onMatch: function(cls) {
            var lower = cls.toLowerCase();
            for (var i = 0; i < targets.length; i++) {
                if (lower.indexOf(targets[i]) !== -1) {
                    found.push(cls);
                    break;
                }
            }
        },
        onComplete: function() {
            console.log("[*] Found " + found.length + " classes");
            found.sort();
            found.forEach(function(c) { console.log(c); });
        }
    });
});
