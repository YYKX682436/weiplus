package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes10.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.f1 f288211d;

    public e1(com.p314xaae8f345.mm.ui.p2690x38b72420.f1 f1Var) {
        this.f288211d = f1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2690x38b72420.f1 f1Var = this.f288211d;
        com.p314xaae8f345.mm.ui.p2690x38b72420.C22293x1808c434 c22293x1808c434 = f1Var.f288232d;
        android.widget.TextView textView = c22293x1808c434.f287887e;
        if (textView != null) {
            if (c22293x1808c434.f287891i == 1) {
                android.content.res.Resources resources = c22293x1808c434.getContext().getResources();
                int i17 = f1Var.f288232d.f287889g;
                textView.setText(resources.getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571198b, i17, java.lang.Integer.valueOf(i17)));
            } else {
                android.content.res.Resources resources2 = c22293x1808c434.getContext().getResources();
                int i18 = f1Var.f288232d.f287889g;
                textView.setText(resources2.getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571197a, i18, java.lang.Integer.valueOf(i18)));
            }
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.C22293x1808c434 c22293x1808c4342 = f1Var.f288232d;
        c22293x1808c4342.m80406xcd1079b0(c22293x1808c4342.f287890h);
    }
}
