package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes8.dex */
public class s1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f101424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.Fragment f101425e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.snackbar.g f101426f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.snackbar.h f101427g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f101428h;

    public s1(android.content.DialogInterface.OnClickListener onClickListener, androidx.fragment.app.Fragment fragment, com.tencent.mm.ui.widget.snackbar.g gVar, com.tencent.mm.ui.widget.snackbar.h hVar, android.app.Activity activity) {
        this.f101424d = onClickListener;
        this.f101425e = fragment;
        this.f101426f = gVar;
        this.f101427g = hVar;
        this.f101428h = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        android.content.DialogInterface.OnClickListener onClickListener = this.f101424d;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, -2);
        }
        com.tencent.mm.ui.widget.snackbar.h hVar = this.f101427g;
        com.tencent.mm.ui.widget.snackbar.g gVar = this.f101426f;
        androidx.fragment.app.Fragment fragment = this.f101425e;
        if (fragment == null) {
            android.app.Activity activity = this.f101428h;
            com.tencent.mm.ui.widget.snackbar.j.c(activity.getString(com.tencent.mm.R.string.cbq), activity.getString(com.tencent.mm.R.string.c_a), activity, gVar, hVar);
            return;
        }
        fragment.getView();
        if (fragment instanceof com.tencent.mm.ui.MMFragment) {
            ((com.tencent.mm.ui.MMFragment) fragment).getContentView();
        }
        com.tencent.mm.ui.widget.snackbar.j.c(fragment.getActivity().getString(com.tencent.mm.R.string.cbq), fragment.getActivity().getString(com.tencent.mm.R.string.c_a), fragment.getContext(), gVar, hVar);
    }
}
