package zh1;

/* loaded from: classes8.dex */
public final class e1 extends zh1.v {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(long j17, bi1.g openMaterialScene, android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 bottomSheet, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 openMaterialCollection, zh1.v0 v0Var, zh1.c1 launchAppBrandExecutor) {
        super(j17, openMaterialScene, context, bottomSheet, openMaterialCollection, v0Var, launchAppBrandExecutor);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialScene, "openMaterialScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialCollection, "openMaterialCollection");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(launchAppBrandExecutor, "launchAppBrandExecutor");
    }

    @Override // zh1.z0
    public void o(zh1.y0 type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        type.toString();
        java.util.List appBrandOpenMaterialDetailModels = this.f554482g.f167785g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appBrandOpenMaterialDetailModels, "appBrandOpenMaterialDetailModels");
        if (!appBrandOpenMaterialDetailModels.isEmpty()) {
            android.content.Context context = this.f554480e;
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569545ee, (android.view.ViewGroup) null);
            int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
            android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jrg);
            if (imageView != null) {
                imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79808xd114fdb4, color));
            }
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jrh);
            if (textView != null) {
                textView.setTextColor(color);
            }
            inflate.setOnClickListener(new zh1.d1(this));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f554481f;
            k0Var.o(inflate);
            this.f554485m.d();
            if (k0Var.i()) {
                zh1.w.b(k0Var, context);
            }
        }
    }
}
