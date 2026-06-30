package com.p314xaae8f345.mm.ui.p2715xbf8d97c1;

/* renamed from: com.tencent.mm.ui.matrix.MatrixSettingHeaderPreference */
/* loaded from: classes3.dex */
public class C22442xfd39a897 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public C22442xfd39a897(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.jd8);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f567398jd2);
        textView.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274647j);
        view.setOnLongClickListener(new nh5.e0(this, imageView));
        view.setOnClickListener(new nh5.f0(this));
    }

    public C22442xfd39a897(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
