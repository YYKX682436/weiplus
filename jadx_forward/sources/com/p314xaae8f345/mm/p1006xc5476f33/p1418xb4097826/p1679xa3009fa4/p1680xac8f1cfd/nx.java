package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes14.dex */
public final class nx implements x91.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx f216903a;

    public nx(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx sxVar) {
        this.f216903a = sxVar;
    }

    @Override // x91.i
    public void a(x91.h hVar) {
        x91.c cVar;
        x91.c cVar2;
        x91.c cVar3;
        x91.c cVar4;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("subEventListener: onStop device[");
        java.lang.String str = null;
        sb6.append((hVar == null || (cVar4 = hVar.f534180a) == null) ? null : cVar4.f534172g);
        sb6.append(',');
        sb6.append((hVar == null || (cVar3 = hVar.f534180a) == null) ? null : cVar3.f534174i);
        sb6.append("] selectedDevice[");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx sxVar = this.f216903a;
        x91.h hVar2 = sxVar.f217474w;
        sb6.append((hVar2 == null || (cVar2 = hVar2.f534180a) == null) ? null : cVar2.f534172g);
        sb6.append(',');
        x91.h hVar3 = sxVar.f217474w;
        if (hVar3 != null && (cVar = hVar3.f534180a) != null) {
            str = cVar.f534174i;
        }
        sb6.append(str);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProjectionScreenUIC", sb6.toString());
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hVar, sxVar.f217474w)) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mx(sxVar));
        }
    }

    @Override // x91.i
    public void b(x91.h hVar) {
        x91.c cVar;
        x91.c cVar2;
        x91.c cVar3;
        x91.c cVar4;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("subEventListener: onPause device[");
        java.lang.String str = null;
        sb6.append((hVar == null || (cVar4 = hVar.f534180a) == null) ? null : cVar4.f534172g);
        sb6.append(',');
        sb6.append((hVar == null || (cVar3 = hVar.f534180a) == null) ? null : cVar3.f534174i);
        sb6.append("] selectedDevice[");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx sxVar = this.f216903a;
        x91.h hVar2 = sxVar.f217474w;
        sb6.append((hVar2 == null || (cVar2 = hVar2.f534180a) == null) ? null : cVar2.f534172g);
        sb6.append(',');
        x91.h hVar3 = sxVar.f217474w;
        if (hVar3 != null && (cVar = hVar3.f534180a) != null) {
            str = cVar.f534174i;
        }
        sb6.append(str);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProjectionScreenUIC", sb6.toString());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hVar, sxVar.f217474w);
    }

    @Override // x91.i
    public void c(x91.h hVar, int i17) {
        x91.c cVar;
        x91.c cVar2;
        x91.c cVar3;
        x91.c cVar4;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("subEventListener: onProgress progress=");
        sb6.append(i17);
        sb6.append(" device[");
        java.lang.String str = null;
        sb6.append((hVar == null || (cVar4 = hVar.f534180a) == null) ? null : cVar4.f534172g);
        sb6.append(',');
        sb6.append((hVar == null || (cVar3 = hVar.f534180a) == null) ? null : cVar3.f534174i);
        sb6.append("] selectedDevice[");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx sxVar = this.f216903a;
        x91.h hVar2 = sxVar.f217474w;
        sb6.append((hVar2 == null || (cVar2 = hVar2.f534180a) == null) ? null : cVar2.f534172g);
        sb6.append(',');
        x91.h hVar3 = sxVar.f217474w;
        if (hVar3 != null && (cVar = hVar3.f534180a) != null) {
            str = cVar.f534174i;
        }
        sb6.append(str);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProjectionScreenUIC", sb6.toString());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hVar, sxVar.f217474w);
    }

    @Override // x91.i
    public void d(x91.h hVar, int i17) {
        x91.c cVar;
        x91.c cVar2;
        x91.c cVar3;
        x91.c cVar4;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("subEventListener: onVolume vol=");
        sb6.append(i17);
        sb6.append(" device[");
        java.lang.String str = null;
        sb6.append((hVar == null || (cVar4 = hVar.f534180a) == null) ? null : cVar4.f534172g);
        sb6.append(',');
        sb6.append((hVar == null || (cVar3 = hVar.f534180a) == null) ? null : cVar3.f534174i);
        sb6.append("] selectedDevice[");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx sxVar = this.f216903a;
        x91.h hVar2 = sxVar.f217474w;
        sb6.append((hVar2 == null || (cVar2 = hVar2.f534180a) == null) ? null : cVar2.f534172g);
        sb6.append(',');
        x91.h hVar3 = sxVar.f217474w;
        if (hVar3 != null && (cVar = hVar3.f534180a) != null) {
            str = cVar.f534174i;
        }
        sb6.append(str);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProjectionScreenUIC", sb6.toString());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hVar, sxVar.f217474w);
    }

    @Override // x91.i
    public void e(x91.h hVar) {
        x91.c cVar;
        x91.c cVar2;
        x91.c cVar3;
        x91.c cVar4;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("subEventListener: onPlay device[");
        java.lang.String str = null;
        sb6.append((hVar == null || (cVar4 = hVar.f534180a) == null) ? null : cVar4.f534172g);
        sb6.append(',');
        sb6.append((hVar == null || (cVar3 = hVar.f534180a) == null) ? null : cVar3.f534174i);
        sb6.append("] selectedDevice[");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx sxVar = this.f216903a;
        x91.h hVar2 = sxVar.f217474w;
        sb6.append((hVar2 == null || (cVar2 = hVar2.f534180a) == null) ? null : cVar2.f534172g);
        sb6.append(',');
        x91.h hVar3 = sxVar.f217474w;
        if (hVar3 != null && (cVar = hVar3.f534180a) != null) {
            str = cVar.f534174i;
        }
        sb6.append(str);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProjectionScreenUIC", sb6.toString());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hVar, sxVar.f217474w);
    }

    @Override // x91.i
    public void f(x91.h hVar, boolean z17) {
        x91.c cVar;
        x91.c cVar2;
        x91.c cVar3;
        x91.c cVar4;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("subEventListener: onMute mute=");
        sb6.append(z17);
        sb6.append(" device[");
        java.lang.String str = null;
        sb6.append((hVar == null || (cVar4 = hVar.f534180a) == null) ? null : cVar4.f534172g);
        sb6.append(',');
        sb6.append((hVar == null || (cVar3 = hVar.f534180a) == null) ? null : cVar3.f534174i);
        sb6.append("] selectedDevice[");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx sxVar = this.f216903a;
        x91.h hVar2 = sxVar.f217474w;
        sb6.append((hVar2 == null || (cVar2 = hVar2.f534180a) == null) ? null : cVar2.f534172g);
        sb6.append(',');
        x91.h hVar3 = sxVar.f217474w;
        if (hVar3 != null && (cVar = hVar3.f534180a) != null) {
            str = cVar.f534174i;
        }
        sb6.append(str);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProjectionScreenUIC", sb6.toString());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hVar, sxVar.f217474w);
    }
}
