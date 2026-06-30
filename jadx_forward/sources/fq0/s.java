package fq0;

/* loaded from: classes3.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq0.x f346998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f346999e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(fq0.x xVar, boolean z17) {
        super(0);
        this.f346998d = xVar;
        this.f346999e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d = this.f346998d.f347021l;
        android.view.ViewParent parent = c10867x3e50a04d != null ? c10867x3e50a04d.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.setClipChildren(this.f346999e);
        }
        return jz5.f0.f384359a;
    }
}
