package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes8.dex */
public class k0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3 f241107d;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3 activityC17301x38c077a3) {
        this.f241107d = activityC17301x38c077a3;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.lang.String str;
        e04.n3 n3Var;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3.S;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3 activityC17301x38c077a3 = this.f241107d;
        activityC17301x38c077a3.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList.add(activityC17301x38c077a3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lah));
        linkedList2.add(0);
        linkedList.add(activityC17301x38c077a3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lag));
        linkedList2.add(1);
        if (!activityC17301x38c077a3.getIntent().getBooleanExtra("key_is_favorite_item", false)) {
            linkedList.add(activityC17301x38c077a3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
            linkedList2.add(2);
        } else if (activityC17301x38c077a3.getIntent().getBooleanExtra("key_can_delete_favorite_item", true)) {
            str = activityC17301x38c077a3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0);
            linkedList.add(activityC17301x38c077a3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571375da));
            linkedList2.add(3);
            java.lang.String str2 = str;
            n3Var = activityC17301x38c077a3.f240852q;
            if (n3Var != null && !android.text.TextUtils.isEmpty(n3Var.f69629xb3d31626)) {
                linkedList.add(activityC17301x38c077a3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bdb));
                linkedList2.add(4);
            }
            db5.e1.d(activityC17301x38c077a3, "", linkedList, linkedList2, str2, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.o0(activityC17301x38c077a3));
            return true;
        }
        str = "";
        java.lang.String str22 = str;
        n3Var = activityC17301x38c077a3.f240852q;
        if (n3Var != null) {
            linkedList.add(activityC17301x38c077a3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bdb));
            linkedList2.add(4);
        }
        db5.e1.d(activityC17301x38c077a3, "", linkedList, linkedList2, str22, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.o0(activityC17301x38c077a3));
        return true;
    }
}
