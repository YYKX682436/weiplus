package c23;

/* loaded from: classes.dex */
public final class e implements al5.o2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c23.m f38022d;

    public e(c23.m mVar) {
        this.f38022d = mVar;
    }

    @Override // al5.o2
    public final void F3(int i17, int i18, int i19, int i27) {
        androidx.appcompat.app.AppCompatActivity activity = this.f38022d.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity).hideVKB();
    }
}
