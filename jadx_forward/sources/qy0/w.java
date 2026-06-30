package qy0;

/* loaded from: classes5.dex */
public final class w implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qy0.d0 f449189d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f449190e;

    public w(qy0.d0 d0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        this.f449189d = d0Var;
        this.f449190e = c0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC", "onPreview: recommend end");
        qy0.d0 d0Var = this.f449189d;
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 m7Var = d0Var.f449116y;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
        m7Var.d(list);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f449190e;
        if (c0Var.f391645d) {
            qy0.d0.U6(d0Var);
            c0Var.f391645d = false;
        }
    }
}
