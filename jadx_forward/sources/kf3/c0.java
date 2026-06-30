package kf3;

/* loaded from: classes.dex */
public class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f388858d;

    /* renamed from: e, reason: collision with root package name */
    public final int f388859e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kf3.k0 f388860f;

    public c0(kf3.k0 k0Var, java.lang.String str, int i17) {
        this.f388860f = k0Var;
        this.f388858d = str;
        this.f388859e = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$OnImageClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean E = c01.d9.b().E();
        kf3.k0 k0Var = this.f388860f;
        if (!E) {
            db5.t7.k(k0Var.f388914t, null);
            yj0.a.h(this, "com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$OnImageClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String str = if3.f0.a() + this.f388858d;
        if (str == null || str.equals("") || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
            yj0.a.h(this, "com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$OnImageClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_compress_type", this.f388859e);
        intent.putExtra("key_favorite", false);
        intent.putExtra("key_image_path", str);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.B(k0Var.f388914t, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$OnImageClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
