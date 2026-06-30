package v46;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile v46.e f514787d = v46.e.f514791o;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.StringBuffer f514788a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f514789b;

    /* renamed from: c, reason: collision with root package name */
    public final v46.e f514790c;

    public a(java.lang.Object obj, v46.e eVar) {
        eVar = eVar == null ? f514787d : eVar;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(512);
        this.f514788a = stringBuffer;
        this.f514790c = eVar;
        this.f514789b = obj;
        if (obj == null) {
            eVar.getClass();
            return;
        }
        if (eVar.f514795e) {
            v46.e.d(obj);
            if (eVar.f514796f) {
                stringBuffer.append(eVar.c(obj.getClass()));
            } else {
                stringBuffer.append(obj.getClass().getName());
            }
        }
        if (eVar.f514797g) {
            v46.e.d(obj);
            stringBuffer.append('@');
            stringBuffer.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj)));
        }
        stringBuffer.append(eVar.f514798h);
        if (eVar.f514800m) {
            stringBuffer.append(eVar.f514801n);
        }
    }

    /* renamed from: toString */
    public java.lang.String m171106x9616526c() {
        v46.e eVar = this.f514790c;
        java.lang.StringBuffer stringBuffer = this.f514788a;
        java.lang.Object obj = this.f514789b;
        if (obj == null) {
            eVar.getClass();
            stringBuffer.append("<null>");
        } else {
            eVar.getClass();
            int length = stringBuffer.length();
            int length2 = eVar.f514801n.length();
            if (length > 0 && length2 > 0 && length >= length2) {
                boolean z17 = false;
                int i17 = 0;
                while (true) {
                    if (i17 >= length2) {
                        z17 = true;
                        break;
                    }
                    if (stringBuffer.charAt((length - 1) - i17) != eVar.f514801n.charAt((length2 - 1) - i17)) {
                        break;
                    }
                    i17++;
                }
                if (z17) {
                    stringBuffer.setLength(length - length2);
                }
            }
            stringBuffer.append(eVar.f514799i);
            v46.e.e(obj);
        }
        return stringBuffer.toString();
    }
}
