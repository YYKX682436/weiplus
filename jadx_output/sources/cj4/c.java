package cj4;

/* loaded from: classes11.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cj4.k f41913e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mj4.h f41914f;

    public c(java.lang.String str, cj4.k kVar, mj4.h hVar) {
        this.f41912d = str;
        this.f41913e = kVar;
        this.f41914f = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/logic/BaseMiniStatusLoadLogic$handleLike$likeClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean b17 = kotlin.jvm.internal.o.b(this.f41912d, en1.a.a());
        cj4.k kVar = this.f41913e;
        if (b17) {
            bi4.m0 m0Var = kVar.V;
            if (m0Var != null && m0Var != null) {
                m0Var.a(6, kVar.f41992x);
            }
        } else {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            kVar.getClass();
            if (java.lang.Math.abs(currentTimeMillis - 0) < 500) {
                yj0.a.h(this, "com/tencent/mm/plugin/textstatus/logic/BaseMiniStatusLoadLogic$handleLike$likeClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            java.lang.Object tag = kVar.e().getTag();
            java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.BaseMiniStatusLoadLogic", "localIsLike:" + bool);
            boolean b18 = kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE) ^ true;
            kVar.k(b18, false);
            bi4.m0 m0Var2 = kVar.V;
            if (m0Var2 != null && m0Var2 != null) {
                m0Var2.a(2, java.lang.Boolean.valueOf(b18));
            }
            mj4.h hVar = this.f41914f;
            if (b18) {
                android.content.Context j17 = kVar.j();
                pf5.z zVar = pf5.z.f353948a;
                if (!(j17 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((com.tencent.mm.plugin.textstatus.ui.kd) zVar.a((androidx.appcompat.app.AppCompatActivity) j17).a(com.tencent.mm.plugin.textstatus.ui.kd.class)).O6(((mj4.k) hVar).l());
            } else {
                android.content.Context j18 = kVar.j();
                pf5.z zVar2 = pf5.z.f353948a;
                if (!(j18 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((com.tencent.mm.plugin.textstatus.ui.kd) zVar2.a((androidx.appcompat.app.AppCompatActivity) j18).a(com.tencent.mm.plugin.textstatus.ui.kd.class)).P6(((mj4.k) hVar).l());
            }
        }
        kVar.r();
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/logic/BaseMiniStatusLoadLogic$handleLike$likeClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
