package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe;

/* loaded from: classes8.dex */
public class f1 implements db5.j4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240257a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636 f240258b;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636 c17263x2beb5636, int i17) {
        this.f240258b = c17263x2beb5636;
        this.f240257a = i17;
    }

    @Override // db5.j4
    public void a(android.widget.ImageView imageView, android.widget.ImageView imageView2, android.view.MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636 c17263x2beb5636 = this.f240258b;
        if (itemId == 7) {
            android.content.Context context = c17263x2beb5636.f240180d;
            imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f80336x9bb432f6, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832)));
            return;
        }
        if (menuItem.getItemId() == this.f240257a && c17263x2beb5636.f240181e != null) {
            o11.f fVar = new o11.f();
            fVar.f423612c = true;
            imageView.setBackground(null);
            imageView.setImageDrawable(null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCodeSheetItemLogic", "mCodeInfoRespItem.UrlType: " + c17263x2beb5636.f240181e.f451734g);
            int i17 = c17263x2beb5636.f240181e.f451734g;
            if (i17 == 4) {
                fVar.f423624o = com.p314xaae8f345.mm.R.raw.f78370x999efabe;
                fVar.f423629t = true;
                n11.a.b().h(c17263x2beb5636.f240181e.f451737m, imageView, fVar.a());
                return;
            }
            if (i17 == 3) {
                fVar.f423624o = com.p314xaae8f345.mm.R.raw.f78923x3b473466;
                fVar.f423629t = true;
                n11.a.b().h(c17263x2beb5636.f240181e.f451737m, imageView, fVar.a());
                return;
            }
            if (i17 == 11) {
                if (((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ri()) {
                    fVar.f423624o = com.p314xaae8f345.mm.R.raw.f78923x3b473466;
                    fVar.f423629t = true;
                    n11.a.b().h(c17263x2beb5636.f240181e.f451737m, imageView, fVar.a());
                    return;
                }
                return;
            }
            if (i17 == 1) {
                fVar.f423629t = true;
                fVar.f423630u = i65.a.b(c17263x2beb5636.f240180d, 4);
                fVar.f423624o = com.p314xaae8f345.mm.R.raw.f78922x61de8d17;
                n11.a.b().h(c17263x2beb5636.f240181e.f451737m, imageView, fVar.a());
                return;
            }
            if (i17 == 2) {
                android.content.Context context2 = c17263x2beb5636.f240180d;
                imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context2, com.p314xaae8f345.mm.R.raw.f80134x91d31f69, context2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832)));
                return;
            }
            if (i17 == 7) {
                fVar.f423629t = true;
                fVar.f423630u = i65.a.b(c17263x2beb5636.f240180d, 4);
                fVar.f423624o = com.p314xaae8f345.mm.R.raw.f78922x61de8d17;
                n11.a.b().h(c17263x2beb5636.f240181e.f451737m, imageView, fVar.a());
                return;
            }
            if (i17 == 6) {
                android.content.Context context3 = c17263x2beb5636.f240180d;
                imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context3, com.p314xaae8f345.mm.R.raw.f80359x70a7cd6a, context3.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832)));
            } else if (i17 == 5) {
                android.content.Context context4 = c17263x2beb5636.f240180d;
                imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context4, com.p314xaae8f345.mm.R.raw.f80253x783ef38e, context4.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832)));
            } else if (i17 == 9) {
                fVar.f423624o = com.p314xaae8f345.mm.R.raw.f78923x3b473466;
                fVar.f423629t = true;
                n11.a.b().h(c17263x2beb5636.f240181e.f451737m, imageView, fVar.a());
            }
        }
    }
}
