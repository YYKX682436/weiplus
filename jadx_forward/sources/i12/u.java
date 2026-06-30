package i12;

/* loaded from: classes15.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i12.x f368778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.ra f368779e;

    public u(i12.x xVar, bw5.ra raVar) {
        this.f368778d = xVar;
        this.f368779e = raVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i12.x xVar = this.f368778d;
        xVar.f368793r.removeAllViews();
        java.util.LinkedList linkedList = this.f368779e.G;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList);
        int size = linkedList.size();
        if (size != 0) {
            float width = (xVar.f368793r.getWidth() + 32.0f) / 96.0f;
            double d17 = width;
            float min = java.lang.Math.min(size, java.lang.Math.max(((double) java.lang.Math.abs(width - ((float) java.lang.Math.floor(d17)))) > 0.5d ? ((float) java.lang.Math.floor(d17)) + 1 : (float) java.lang.Math.floor(d17), 4));
            float floor = (float) java.lang.Math.floor((r3 - ((min - 1) * 32.0f)) / min);
            int i17 = (int) min;
            for (int i18 = 0; i18 < i17; i18++) {
                r45.ri0 ri0Var = (r45.ri0) linkedList.get(i18);
                android.widget.ImageView imageView = new android.widget.ImageView(xVar.f368784f);
                int i19 = (int) floor;
                imageView.setLayoutParams(new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams(i19, i19));
                n11.a b17 = n11.a.b();
                java.lang.String str = ri0Var.f466421f;
                b17.h(str, imageView, y12.f.b(ri0Var.f466425m, str));
                imageView.setBackground(xVar.f368784f.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f78055x8092b181));
                imageView.setOnClickListener(new i12.t(xVar, ri0Var));
                xVar.f368793r.addView(imageView);
            }
        }
    }
}
