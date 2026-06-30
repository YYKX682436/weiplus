package wj1;

/* loaded from: classes14.dex */
public class k0 implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 f528137d;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 activityC12702xc32382a5) {
        this.f528137d = activityC12702xc32382a5;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 c12542x3a17e581;
        db1.p pVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 activityC12702xc32382a5 = this.f528137d;
        java.util.Iterator it = activityC12702xc32382a5.f171082y.f309402z.iterator();
        while (true) {
            if (!it.hasNext()) {
                c12542x3a17e581 = null;
                break;
            }
            c12542x3a17e581 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581) it.next();
            if (c12542x3a17e581.f168940o) {
                break;
            }
        }
        activityC12702xc32382a5.A = c12542x3a17e581;
        fl1.c0 c0Var = activityC12702xc32382a5.f171081x;
        if (c0Var != null && (pVar = activityC12702xc32382a5.f171082y) != null) {
            c0Var.a(pVar);
        }
        ((wj1.c0) activityC12702xc32382a5.B).b();
        return null;
    }
}
