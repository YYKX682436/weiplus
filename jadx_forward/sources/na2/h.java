package na2;

/* loaded from: classes2.dex */
public final class h implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ na2.k f417495a;

    public h(na2.k kVar) {
        this.f417495a = kVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[2];
        na2.k kVar = this.f417495a;
        android.widget.TextView textView = kVar.f417499g;
        lVarArr[0] = new jz5.l("cluster_name", textView != null ? textView.getText() : null);
        android.widget.TextView textView2 = kVar.f417500h;
        lVarArr[1] = new jz5.l("cluster_reason_recommendation", textView2 != null ? textView2.getText() : null);
        return kz5.c1.k(lVarArr);
    }
}
