package ap1;

/* loaded from: classes5.dex */
public class x0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f94294d;

    /* renamed from: e, reason: collision with root package name */
    public j75.f f94295e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f94294d = new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        android.view.View m80380x71e92c1d = m80380x71e92c1d();
        j75.f fVar = this.f94295e;
        if (fVar == null) {
            fVar = Q6();
            this.f94295e = fVar;
        }
        if (fVar == null) {
            return;
        }
        int i17 = ((ap1.c2) fVar.mo140437x75286adb()).f94159g;
        java.util.ArrayList arrayList = this.f94294d;
        if (i17 == 1) {
            java.lang.String[] stringArray = m158361x893a2f6f().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559552b0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringArray, "getStringArray(...)");
            arrayList.add(new jz5.l(stringArray[0], ap1.p0.f94249d));
            arrayList.add(new jz5.l(stringArray[1], ap1.p0.f94250e));
        } else if (i17 == 2) {
            java.lang.String[] stringArray2 = m158361x893a2f6f().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559552b0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringArray2, "getStringArray(...)");
            arrayList.add(new jz5.l(stringArray2[2], ap1.p0.f94251f));
            arrayList.add(new jz5.l(stringArray2[3], ap1.p0.f94252g));
        } else {
            if (i17 != 3) {
                ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.C22684x1bd928a0) m80380x71e92c1d.findViewById(com.p314xaae8f345.mm.R.id.e4a)).setVisibility(8);
                return;
            }
            java.lang.String[] stringArray3 = m158361x893a2f6f().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559552b0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringArray3, "getStringArray(...)");
            arrayList.add(new jz5.l(stringArray3[0], ap1.p0.f94249d));
            arrayList.add(new jz5.l(stringArray3[1], ap1.p0.f94250e));
            arrayList.add(new jz5.l(stringArray3[2], ap1.p0.f94251f));
            arrayList.add(new jz5.l(stringArray3[3], ap1.p0.f94252g));
        }
        ap1.w0 w0Var = new ap1.w0(this, fVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.C22684x1bd928a0 c22684x1bd928a0 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.C22684x1bd928a0) m80380x71e92c1d.findViewById(com.p314xaae8f345.mm.R.id.e4a);
        c22684x1bd928a0.setVisibility(0);
        c22684x1bd928a0.setBackgroundColor(m158355x7444d5ad(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
        c22684x1bd928a0.m81950xe77956e5(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.x2.AlignLeft);
        c22684x1bd928a0.m81951xbbb2caf7(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y2.Null);
        c22684x1bd928a0.m81949xf0b64aeb(kz5.b0.c(w0Var));
        fVar.L2(m158354x19263085(), new ap1.q0(this, fVar, w0Var));
        j75.f fVar2 = this.f94295e;
        if (fVar2 == null) {
            fVar2 = Q6();
            this.f94295e = fVar2;
        }
        if (fVar2 != null) {
            fVar2.z3(m158354x19263085(), ap1.v0.f94282d);
        }
    }
}
