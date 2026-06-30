package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes8.dex */
public class w0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.t0 {

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f220861e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f220862f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f220863g;

    public w0(android.view.View view) {
        super(view);
        this.f220861e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.oml);
        this.f220862f = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.hnd);
        this.f220863g = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.hk9);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.t0
    public void i(w33.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.Lbs lbs, int i17, long j17, long j18, java.util.List list) {
    }

    public void j(boolean z17, boolean z18) {
        android.widget.TextView textView = this.f220861e;
        android.widget.ImageView imageView = this.f220862f;
        android.widget.ImageView imageView2 = this.f220863g;
        if (z17) {
            textView.setText("收起小组");
            imageView.setVisibility(8);
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                imageView2.setImageResource(com.p314xaae8f345.mm.R.raw.f79609xe51133ff);
                return;
            } else {
                imageView2.setImageResource(com.p314xaae8f345.mm.R.raw.f79610xe512cf68);
                return;
            }
        }
        textView.setText("展开小组");
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            imageView2.setImageResource(com.p314xaae8f345.mm.R.raw.f79606xabab0518);
        } else {
            imageView2.setImageResource(com.p314xaae8f345.mm.R.raw.f79607xabaca081);
        }
        if (z18) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
    }
}
