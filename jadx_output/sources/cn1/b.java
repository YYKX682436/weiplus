package cn1;

/* loaded from: classes14.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cn1.e f43452d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(cn1.e eVar) {
        super(0);
        this.f43452d = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View a17 = this.f43452d.a();
        kotlin.jvm.internal.o.d(a17);
        return (com.tencent.mm.ui.widget.imageview.WeImageView) a17.findViewById(com.tencent.mm.R.id.gxz);
    }
}
