package com.tencent.mm.plugin.finder.feed.ui;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderGameSelectUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderGameLiveBaseUI;", "Landroid/view/View;", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "setRoot", "(Landroid/view/View;)V", "root", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderGameSelectUI extends com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveBaseUI {
    public static final /* synthetic */ int F = 0;

    /* renamed from: A, reason: from kotlin metadata */
    public android.view.View root;
    public android.widget.EditText B;
    public android.widget.RelativeLayout C;
    public boolean D;

    /* renamed from: y, reason: collision with root package name */
    public cm2.m f109290y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f109291z;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f109288w = "Finder.FinderGameSelectUI";

    /* renamed from: x, reason: collision with root package name */
    public final java.util.ArrayList f109289x = new java.util.ArrayList();
    public final jz5.g E = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.y4(this));

    public static final void d7(com.tencent.mm.plugin.finder.feed.ui.FinderGameSelectUI finderGameSelectUI, r45.n73 n73Var) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String string;
        finderGameSelectUI.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("go postui, game:");
        r45.z53 z53Var = (r45.z53) n73Var.getCustom(1);
        sb6.append(z53Var != null ? z53Var.getString(1) : null);
        sb6.append(", ");
        r45.z53 z53Var2 = (r45.z53) n73Var.getCustom(1);
        sb6.append(z53Var2 != null ? z53Var2.getString(0) : null);
        com.tencent.mars.xlog.Log.i(finderGameSelectUI.f109288w, sb6.toString());
        android.content.Intent intent = new android.content.Intent();
        r45.s63 s63Var = (r45.s63) n73Var.getCustom(3);
        java.lang.String str3 = "";
        if (s63Var == null || (str = s63Var.getString(1)) == null) {
            str = "";
        }
        intent.putExtra("COVER_URL", str);
        r45.s63 s63Var2 = (r45.s63) n73Var.getCustom(3);
        if (s63Var2 == null || (str2 = s63Var2.getString(0)) == null) {
            str2 = "";
        }
        intent.putExtra("DESC", str2);
        intent.putExtra("TICKET", "");
        r45.z53 z53Var3 = (r45.z53) n73Var.getCustom(1);
        if (z53Var3 != null && (string = z53Var3.getString(0)) != null) {
            str3 = string;
        }
        intent.putExtra("APPID", str3);
        intent.putExtra("POST_FROM_SCENE", 0);
        intent.putExtra("GameUserInfo", n73Var.toByteArray());
        intent.putExtra("MINI_GAME_SCENE", 1);
    }

    public static final void e7(com.tencent.mm.plugin.finder.feed.ui.FinderGameSelectUI finderGameSelectUI) {
        finderGameSelectUI.getClass();
        c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
        androidx.appcompat.app.AppCompatActivity context = finderGameSelectUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.content.Intent intent = new android.content.Intent();
        ((com.tencent.mm.plugin.finder.assist.i0) ubVar).getClass();
        com.tencent.mars.xlog.Log.i("Finder.ActivityRouter", "enterFinderGameLiveSearchUI");
        intent.setClass(context, (java.lang.Class) ((jz5.n) jz2.x0.F).getValue());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderGameSearchUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderGameSearchUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView f7() {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f109291z;
        if (wxRecyclerView != null) {
            return wxRecyclerView;
        }
        kotlin.jvm.internal.o.o("rv");
        throw null;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity
    public int getCustomBounceId() {
        return com.tencent.mm.R.id.goj;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ajx;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00df A[LOOP:1: B:16:0x00d9->B:18:0x00df, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011e A[SYNTHETIC] */
    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveBaseUI, com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.FinderGameSelectUI.onCreate(android.os.Bundle):void");
    }

    public final void setRoot(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.root = view;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(d92.b1.class);
    }
}
