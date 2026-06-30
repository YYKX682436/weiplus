package wq3;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f530101a;

    public k() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f530101a = arrayList;
        arrayList.clear();
        gm0.j1.i();
        java.util.Iterator it = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(((java.lang.String) gm0.j1.u().c().l(270340, "")).split(";")).iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                arrayList.add(str);
            }
        }
    }

    public final boolean a() {
        java.util.List list = this.f530101a;
        ((java.util.ArrayList) list).size();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !str.contains(";")) {
                stringBuffer.append(str);
            }
        }
        gm0.j1.i();
        gm0.j1.u().c().w(270340, stringBuffer.toString());
        return true;
    }
}
