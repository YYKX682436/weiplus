package db5;

/* loaded from: classes11.dex */
public final class o3 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a f309988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f309989e;

    public o3(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a, android.content.Context context) {
        this.f309988d = c21503x6e5a020a;
        this.f309989e = context;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int g17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.g(java.lang.String.valueOf(editable));
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = this.f309988d;
        int textLimitLength = c21503x6e5a020a.getTextLimitLength() - c21503x6e5a020a.m79024xbfc235df();
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            c21503x6e5a020a.getTextLimitLength();
            c21503x6e5a020a.m79024xbfc235df();
        }
        if (c21503x6e5a020a.getTextLimitLength() <= 0) {
            return;
        }
        int textLimitLength2 = c21503x6e5a020a.getTextLimitLength();
        android.content.Context context = this.f309989e;
        if (g17 > textLimitLength2) {
            c21503x6e5a020a.f278987g.setText(c21503x6e5a020a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f81560new, java.lang.Integer.valueOf(g17 - c21503x6e5a020a.getTextLimitLength())));
            c21503x6e5a020a.f278987g.setTextColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
            c21503x6e5a020a.f278987g.setVisibility(0);
        } else if (c21503x6e5a020a.getTextLimitLength() == g17) {
            c21503x6e5a020a.f278987g.setText(c21503x6e5a020a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nex));
            c21503x6e5a020a.f278987g.setTextColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
            c21503x6e5a020a.f278987g.setVisibility(0);
        } else if (g17 >= textLimitLength) {
            c21503x6e5a020a.f278987g.setText(c21503x6e5a020a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ney, java.lang.Integer.valueOf(c21503x6e5a020a.getTextLimitLength() - g17)));
            c21503x6e5a020a.f278987g.setTextColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
            c21503x6e5a020a.f278987g.setVisibility(0);
        } else {
            c21503x6e5a020a.f278987g.setVisibility(8);
        }
        if (c21503x6e5a020a.f278987g.getVisibility() == 0) {
            android.widget.TextView textView = c21503x6e5a020a.f278987g;
            textView.announceForAccessibility(textView.getText());
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a.a(c21503x6e5a020a);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        this.f309988d.m79031xa58772b(true);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
