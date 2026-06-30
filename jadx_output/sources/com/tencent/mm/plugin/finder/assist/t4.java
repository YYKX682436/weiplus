package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class t4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.t4 f102549d = new com.tencent.mm.plugin.finder.assist.t4();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("FinderMenuUtil", "dialog cancel");
        dialogInterface.dismiss();
    }
}
