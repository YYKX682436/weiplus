package y35;

/* loaded from: classes4.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f540738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19713xa55b1053 f540739e;

    public d0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19713xa55b1053 c19713xa55b1053, java.lang.String str) {
        this.f540739e = c19713xa55b1053;
        this.f540738d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5883x4f505eb7 c5883x4f505eb7 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5883x4f505eb7();
        c5883x4f505eb7.f136190g.f90006a = this.f540738d;
        c5883x4f505eb7.e();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        am.zp zpVar = c5883x4f505eb7.f136191h;
        r45.jj4 jj4Var = zpVar.f90128a;
        if (jj4Var != null) {
            linkedList.add(jj4Var);
        }
        r45.jj4 jj4Var2 = zpVar.f90129b;
        if (jj4Var2 != null) {
            linkedList.add(jj4Var2);
        }
        r45.jj4 jj4Var3 = zpVar.f90130c;
        if (jj4Var3 != null) {
            linkedList.add(jj4Var3);
        }
        r45.jj4 jj4Var4 = zpVar.f90131d;
        if (jj4Var4 != null) {
            linkedList.add(jj4Var4);
        }
        this.f540739e.Y.runOnUiThread(new y35.c0(this, linkedList));
    }
}
