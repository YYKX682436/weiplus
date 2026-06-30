package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class ga extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ka f197864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f197865e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f197866f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ka kaVar, int i17, int i18) {
        super(0);
        this.f197864d = kaVar;
        this.f197865e = i17;
        this.f197866f = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String string;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ka kaVar = this.f197864d;
        android.widget.TextView textView = kaVar.N;
        if (textView != null) {
            android.content.Context context = kaVar.f199716e;
            int i17 = this.f197865e;
            java.lang.String str = "";
            if (i17 == 4) {
                string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e8u);
            } else if (i17 == 7) {
                string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e8x);
            } else if (i17 == 15) {
                string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e8v);
            } else if (i17 != 999) {
                switch (i17) {
                    case 18:
                        string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m3o);
                        break;
                    case 19:
                        string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m5r);
                        break;
                    case 20:
                        string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fba);
                        break;
                    default:
                        string = "";
                        break;
                }
            } else {
                string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e8w);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            if (string.length() > 0) {
                int i18 = this.f197866f;
                if (i18 > 0) {
                    str = string + " (" + i18 + ')';
                } else {
                    str = string;
                }
            }
            textView.setText(str);
        }
        return jz5.f0.f384359a;
    }
}
