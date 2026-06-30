package ku3;

/* loaded from: classes10.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.i0 f393960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f393961e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f393962f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zt3.c f393963g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ku3.x f393964h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f393965i;

    public v(ku3.i0 i0Var, int i17, int i18, zt3.c cVar, ku3.x xVar, android.widget.FrameLayout frameLayout) {
        this.f393960d = i0Var;
        this.f393961e = i17;
        this.f393962f = i18;
        this.f393963g = cVar;
        this.f393964h = xVar;
        this.f393965i = frameLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        zt3.c cVar;
        zt3.c cVar2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitMenuPlugin$initLogic$2$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ku3.i0 i0Var = this.f393960d;
        java.lang.Integer num = (java.lang.Integer) i0Var.f393784d.f557111f.get(java.lang.Integer.valueOf(this.f393961e));
        if (num == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitMenuPlugin$initLogic$2$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int intValue = num.intValue();
        zt3.a aVar = i0Var.f393784d;
        p012xc85e97e9.p093xedfae76a.j0 j0Var = (p012xc85e97e9.p093xedfae76a.j0) aVar.f557112g.get(java.lang.Integer.valueOf(intValue));
        if (!((j0Var == null || (cVar2 = (zt3.c) j0Var.mo3195x754a37bb()) == null) ? true : cVar2.f557123d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKitMenuPlugin", "checkFun is no can select " + intValue);
            yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitMenuPlugin$initLogic$2$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (intValue == 5) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putFloat("PARAM_1_FLOAT", view.getX());
            aVar.T6(12, 0, bundle);
            zt3.a.U6(i0Var.f393784d, 16, 4, null, 4, null);
        } else if (intValue == 6) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putFloat("PARAM_1_FLOAT", view.getX());
            aVar.T6(13, 0, bundle2);
            zt3.a.U6(i0Var.f393784d, 16, 4, null, 4, null);
        } else if (intValue == 7) {
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putFloat("PARAM_1_FLOAT", view.getX());
            aVar.T6(14, 0, bundle3);
            zt3.a.U6(i0Var.f393784d, 16, 4, null, 4, null);
        } else if (intValue != 9) {
            p012xc85e97e9.p093xedfae76a.j0 j0Var2 = (p012xc85e97e9.p093xedfae76a.j0) aVar.f557112g.get(java.lang.Integer.valueOf(intValue));
            if (j0Var2 == null || (cVar = (zt3.c) j0Var2.mo3195x754a37bb()) == null) {
                cVar = new zt3.c(this.f393962f, false, null, false, false, 30, null);
            }
            boolean z17 = !cVar.f557121b;
            zt3.a aVar2 = i0Var.f393784d;
            zt3.c cVar3 = this.f393963g;
            zt3.a.V6(aVar2, cVar3.f557120a, z17, null, false, false, 28, null);
            this.f393964h.x(new zt3.c(cVar3.f557120a, z17, null, false, false, 28, null), this.f393965i);
        } else {
            android.os.Bundle bundle4 = new android.os.Bundle();
            bundle4.putFloat("PARAM_1_FLOAT", view.getX());
            aVar.T6(15, 0, bundle4);
            zt3.a.U6(i0Var.f393784d, 16, 4, null, 4, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitMenuPlugin$initLogic$2$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
