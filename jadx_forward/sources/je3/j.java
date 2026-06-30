package je3;

/* loaded from: classes7.dex */
public abstract class j {
    public static final void a(je3.i iVar, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16452xe7b8a75f key, java.lang.String bizName, java.util.Map extraPairs) {
        java.lang.String sb6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraPairs, "extraPairs");
        if (extraPairs.isEmpty()) {
            sb6 = "bizName:".concat(bizName);
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("bizName:");
            sb7.append(bizName);
            for (java.util.Map.Entry entry : extraPairs.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                java.lang.Object value = entry.getValue();
                if (value != null) {
                    sb7.append(';');
                    sb7.append(str);
                    sb7.append(':');
                    sb7.append(value);
                }
            }
            sb6 = sb7.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb6, "toString(...)");
        }
        iVar.Sc(key.name(), 1, sb6, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16455x3f8428aa.f37609x7a9310ab.getValue());
    }
}
