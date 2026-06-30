package com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb;

/* renamed from: com.tencent.weui.base.preference.PreferenceTitleCategory */
/* loaded from: classes3.dex */
public class C27750x1a71b23b extends com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27747x79ac8f19 {
    public C27750x1a71b23b(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.preference.Preference
    public void onBindView(android.view.View view) {
        super.onBindView(view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(android.R.id.title);
        if (textView == null) {
            return;
        }
        if (getTitle() == null || getTitle().length() <= 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(getTitle());
        }
    }

    public C27750x1a71b23b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        if (getLayoutResource() != com.p314xaae8f345.mm.R.C30864xbddafb2a.c0i) {
            setLayoutResource(com.p314xaae8f345.mm.R.C30864xbddafb2a.c0e);
        }
    }
}
