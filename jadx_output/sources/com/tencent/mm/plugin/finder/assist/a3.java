package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class a3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f101999a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102000b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102001c;

    public a3(android.content.Intent intent, java.lang.String str, java.lang.String str2, int i17) {
        this.f101999a = intent;
        this.f102000b = str;
        this.f102001c = str2;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.n73 n73Var;
        java.lang.String str;
        java.lang.String string;
        java.util.LinkedList list;
        java.lang.Object obj2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            r45.hv1 hv1Var = (r45.hv1) fVar.f70618d;
            java.lang.String str2 = this.f102001c;
            if (hv1Var == null || (list = hv1Var.getList(1)) == null) {
                n73Var = null;
            } else {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    r45.z53 z53Var = (r45.z53) ((r45.n73) obj2).getCustom(1);
                    if (kotlin.jvm.internal.o.b(z53Var != null ? z53Var.getString(0) : null, str2)) {
                        break;
                    }
                }
                n73Var = (r45.n73) obj2;
            }
            if ((n73Var != null ? (r45.s63) n73Var.getCustom(3) : null) == null) {
                com.tencent.mm.plugin.finder.assist.b3 b3Var = com.tencent.mm.plugin.finder.assist.b3.f102022a;
                com.tencent.mars.xlog.Log.w("Finder.FinderGameLiveUtil", "detail null");
            } else {
                com.tencent.mm.plugin.finder.assist.b3 b3Var2 = com.tencent.mm.plugin.finder.assist.b3.f102022a;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpGamePostUI ");
                r45.z53 z53Var2 = (r45.z53) n73Var.getCustom(1);
                sb6.append(z53Var2 != null ? z53Var2.getString(1) : null);
                sb6.append(", ");
                r45.z53 z53Var3 = (r45.z53) n73Var.getCustom(1);
                sb6.append(z53Var3 != null ? z53Var3.getString(4) : null);
                com.tencent.mars.xlog.Log.i("Finder.FinderGameLiveUtil", sb6.toString());
                r45.s63 s63Var = (r45.s63) n73Var.getCustom(3);
                java.lang.String str3 = "";
                if (s63Var == null || (str = s63Var.getString(1)) == null) {
                    str = "";
                }
                r45.s63 s63Var2 = (r45.s63) n73Var.getCustom(3);
                if (s63Var2 != null && (string = s63Var2.getString(0)) != null) {
                    str3 = string;
                }
                android.content.Intent intent = this.f101999a;
                intent.putExtra("COVER_URL", str);
                intent.putExtra("DESC", str3);
                intent.putExtra("TICKET", this.f102000b);
                intent.putExtra("APPID", str2);
                intent.putExtra("POST_FROM_SCENE", 0);
                intent.putExtra("GameUserInfo", n73Var.toByteArray());
                intent.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
                com.tencent.mm.plugin.finder.assist.b3.f102022a.k(intent);
            }
        } else {
            com.tencent.mm.plugin.finder.assist.b3 b3Var3 = com.tencent.mm.plugin.finder.assist.b3.f102022a;
            com.tencent.mars.xlog.Log.w("Finder.FinderGameLiveUtil", "CgiFinderLiveGetUserGameConfig failed.");
        }
        return jz5.f0.f302826a;
    }
}
