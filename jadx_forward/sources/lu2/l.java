package lu2;

/* loaded from: classes8.dex */
public final class l implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 f402911a;

    public l(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var) {
        this.f402911a = c0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.z
    public final void a(boolean z17, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str;
        this.f402911a.d();
        if (z17) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, "视频号")) {
                lu2.m mVar = lu2.m.f402912a;
                str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
                lu2.m.a(mVar, "FinderEntrance", str, 10, 1, obj2, obj3);
                return;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, "直播")) {
                lu2.m mVar2 = lu2.m.f402912a;
                str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
                lu2.m.a(mVar2, "FinderLiveEntrance", str, 13, 2, obj2, obj3);
                return;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, "听一听")) {
                lu2.m mVar3 = lu2.m.f402912a;
                str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
                lu2.m.a(mVar3, "Listen.Entrance", str, 600000, 10, obj2, obj3);
                return;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, "看一看")) {
                lu2.m mVar4 = lu2.m.f402912a;
                str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
                lu2.m.a(mVar4, "NewLife.Entrance", str, 300000, 6, obj2, obj3);
                return;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, "长视频")) {
                lu2.m mVar5 = lu2.m.f402912a;
                str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
                lu2.m.a(mVar5, "NewLife.Entrance", str, 400000, 8, obj2, obj3);
                return;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, "图文(下线)")) {
                lu2.m mVar6 = lu2.m.f402912a;
                str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
                lu2.m.a(mVar6, "NewLife.Entrance", str, 100001, 4, obj2, obj3);
                return;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, "搜一搜")) {
                lu2.m mVar7 = lu2.m.f402912a;
                str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
                lu2.m.a(mVar7, "Search.Entrance", str, 500000, 9, obj2, obj3);
                return;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, "游戏")) {
                lu2.m mVar8 = lu2.m.f402912a;
                str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
                lu2.m.a(mVar8, "Game.Entrance", str, 800000, 13, obj2, obj3);
            }
        }
    }
}
