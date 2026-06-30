package zo1;

/* loaded from: classes.dex */
public final class d1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f556110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f556111e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f556112f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, java.lang.ref.WeakReference weakReference, java.util.List list) {
        super(0);
        this.f556110d = u3Var;
        this.f556111e = weakReference;
        this.f556112f = list;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f556110d.dismiss();
        yz5.l lVar = (yz5.l) this.f556111e.get();
        if (lVar != null) {
            lVar.mo146xb9724478(this.f556112f);
        }
        return jz5.f0.f384359a;
    }
}
