package b33;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b33.f f17660d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b33.f fVar) {
        super(0);
        this.f17660d = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.f17660d.findViewById(com.tencent.mm.R.id.f487015n65);
        frameLayout.setOnClickListener(b33.b.f17659d);
        return frameLayout;
    }
}
