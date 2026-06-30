package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class s3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f66910a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66911b;

    public s3(kotlinx.coroutines.q qVar, com.tencent.mm.feature.finder.live.v4 v4Var, java.lang.String str) {
        this.f66910a = qVar;
        this.f66911b = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.Object obj2;
        jz5.f0 f0Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        kotlinx.coroutines.q qVar = this.f66910a;
        if (i17 == 0 && fVar.f70616b == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "#getFullGameInfo client_local_cache=" + ((r45.hv1) fVar.f70618d).getBoolean(5));
            if (((r45.hv1) fVar.f70618d).getBoolean(5)) {
                if (((mm2.s1) dk2.ef.f233372a.i(mm2.s1.class)) != null) {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_LAST_POST_MODE_STRING_SYNC, "");
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_LAST_POST_GAME_APPID_STRING_SYNC, "");
                }
                ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(null));
            } else {
                java.util.LinkedList list = ((r45.hv1) fVar.f70618d).getList(1);
                kotlin.jvm.internal.o.f(list, "getGame_user_info_list(...)");
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    r45.n73 n73Var = (r45.n73) obj2;
                    r45.z53 z53Var = (r45.z53) n73Var.getCustom(1);
                    boolean z17 = false;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(z53Var != null ? z53Var.getString(0) : null)) {
                        r45.z53 z53Var2 = (r45.z53) n73Var.getCustom(1);
                        if (kotlin.jvm.internal.o.b(z53Var2 != null ? z53Var2.getString(0) : null, this.f66911b)) {
                            z17 = true;
                        }
                    }
                    if (z17) {
                        break;
                    }
                }
                r45.n73 n73Var2 = (r45.n73) obj2;
                if (n73Var2 != null) {
                    ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(n73Var2));
                    f0Var = f0Var2;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(null));
                }
            }
        } else {
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(null));
        }
        return f0Var2;
    }
}
