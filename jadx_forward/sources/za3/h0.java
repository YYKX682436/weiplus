package za3;

/* loaded from: classes15.dex */
public class h0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ za3.i0 f552460a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(za3.i0 i0Var, android.os.Looper looper) {
        super(looper);
        this.f552460a = i0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int i17 = message.what;
        za3.i0 i0Var = this.f552460a;
        switch (i17) {
            case 1:
                i0Var.f552463a.setText(i0Var.f552473k);
                return;
            case 2:
                boolean z17 = i0Var.f552471i;
                boolean z18 = i0Var.f552472j;
                if (z17 || z18) {
                    return;
                }
                int i18 = i0Var.f552468f;
                android.widget.TextView textView = i0Var.f552463a;
                textView.setTextColor(i18);
                textView.invalidate();
                int intValue = ((java.lang.Integer) message.obj).intValue();
                android.content.Context context = i0Var.f552464b;
                if (intValue == 0) {
                    textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k1k));
                    return;
                } else {
                    textView.setText(context.getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571229a7, intValue, java.lang.Integer.valueOf(intValue)));
                    return;
                }
            case 3:
                if (i0Var.f552472j || i0Var.f552471i) {
                    mo50303x856b99f0(3);
                    android.os.Message obtain = android.os.Message.obtain();
                    obtain.what = 3;
                    obtain.obj = message.obj;
                    mo50308x2936bf5f(obtain);
                    return;
                }
                android.widget.TextView textView2 = i0Var.f552463a;
                i0Var.f552473k = textView2.getText().toString();
                textView2.setTextColor(i0Var.f552467e);
                textView2.invalidate();
                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String str = (java.lang.String) message.obj;
                ((sg3.a) v0Var).getClass();
                textView2.setText(i0Var.f552464b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k1q, c01.a2.e(str)));
                if (i0Var.f552471i || i0Var.f552472j) {
                    za3.i0.a(i0Var, true);
                    return;
                }
                return;
            case 4:
                if (i0Var.f552472j || i0Var.f552471i) {
                    mo50303x856b99f0(4);
                    android.os.Message obtain2 = android.os.Message.obtain();
                    obtain2.what = 4;
                    obtain2.obj = message.obj;
                    mo50308x2936bf5f(obtain2);
                    return;
                }
                android.widget.TextView textView3 = i0Var.f552463a;
                i0Var.f552473k = textView3.getText().toString();
                textView3.setTextColor(i0Var.f552467e);
                textView3.invalidate();
                tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String str2 = (java.lang.String) message.obj;
                ((sg3.a) v0Var2).getClass();
                textView3.setText(i0Var.f552464b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k1r, c01.a2.e(str2)));
                if (i0Var.f552471i || i0Var.f552472j) {
                    za3.i0.a(i0Var, true);
                    return;
                }
                return;
            case 5:
                i0Var.f552472j = true;
                i0Var.f552471i = false;
                int i19 = i0Var.f552467e;
                android.widget.TextView textView4 = i0Var.f552463a;
                textView4.setTextColor(i19);
                textView4.invalidate();
                tg3.v0 v0Var3 = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String str3 = (java.lang.String) message.obj;
                ((sg3.a) v0Var3).getClass();
                textView4.setText(i0Var.f552464b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k1s, c01.a2.e(str3)));
                return;
            case 6:
                i0Var.f552471i = true;
                i0Var.f552472j = false;
                int i27 = i0Var.f552467e;
                android.widget.TextView textView5 = i0Var.f552463a;
                textView5.setTextColor(i27);
                textView5.invalidate();
                textView5.setText(i0Var.f552464b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k1p));
                return;
            case 7:
                i0Var.f552472j = true;
                int i28 = i0Var.f552469g;
                android.widget.TextView textView6 = i0Var.f552463a;
                textView6.setTextColor(i28);
                textView6.invalidate();
                textView6.setText(i0Var.f552464b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k1u));
                i0Var.f552473k = textView6.getText().toString();
                za3.i0.a(i0Var, true);
                return;
            case 8:
                int i29 = i0Var.f552470h;
                android.widget.TextView textView7 = i0Var.f552463a;
                textView7.setTextColor(i29);
                textView7.invalidate();
                textView7.setText(i0Var.f552464b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k1v));
                return;
            case 9:
                i0Var.f552471i = false;
                if (i0Var.f552472j) {
                    return;
                }
                i0Var.b(true);
                return;
            case 10:
                i0Var.f552472j = false;
                i0Var.b(false);
                return;
            default:
                return;
        }
    }
}
