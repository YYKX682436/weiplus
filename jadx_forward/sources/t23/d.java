package t23;

/* loaded from: classes10.dex */
public final class d implements e60.z0 {

    /* renamed from: a, reason: collision with root package name */
    public e60.x0 f496658a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f496660c;

    /* renamed from: d, reason: collision with root package name */
    public e60.y0 f496661d;

    /* renamed from: f, reason: collision with root package name */
    public v23.b f496663f;

    /* renamed from: g, reason: collision with root package name */
    public u23.s f496664g;

    /* renamed from: h, reason: collision with root package name */
    public u23.n f496665h;

    /* renamed from: b, reason: collision with root package name */
    public int f496659b = -1;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f496662e = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final t23.b f496666i = new t23.b(this);

    /* renamed from: j, reason: collision with root package name */
    public final t23.a f496667j = new t23.a(this);

    /* renamed from: k, reason: collision with root package name */
    public final t23.c f496668k = new t23.c(this);

    public final v23.b a(java.util.List list, java.lang.String str, java.lang.String str2) {
        java.lang.Object obj;
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            v23.b bVar = (v23.b) obj;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar.f514419a, str) && (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, bVar.f514421c))) {
                break;
            }
        }
        v23.b bVar2 = (v23.b) obj;
        return bVar2 == null ? (v23.b) list.get(0) : bVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (r1.f505641e == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(int r25, java.lang.Boolean r26) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t23.d.b(int, java.lang.Boolean):void");
    }

    public void c(java.lang.String folderName, java.lang.Boolean bool, java.lang.String targetBucketId) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d0183;
        boolean booleanValue = bool.booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(folderName, "folderName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetBucketId, "targetBucketId");
        v23.b a17 = a(this.f496662e, folderName, targetBucketId);
        if (booleanValue) {
            this.f496663f = a17;
        }
        v23.b bVar = this.f496663f;
        if (bVar == null) {
            c15630x7d8d0183 = null;
        } else if (bVar instanceof v23.c) {
            c15630x7d8d0183 = ((v23.c) bVar).f514425g;
        } else {
            java.util.List list = bVar.f514420b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d01832 = new com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183(bVar.f514419a, list.size());
            c15630x7d8d01832.r(bVar.f514421c);
            c15630x7d8d01832.f219953i = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) kz5.n0.a0(list, 0);
            c15630x7d8d01832.f219954m = bVar.f514422d;
            c15630x7d8d01832.f219955n = bVar.f514423e == 2;
            c15630x7d8d0183 = c15630x7d8d01832;
        }
        e60.y0 y0Var = this.f496661d;
        if (y0Var != null) {
            java.util.List list2 = a17.f514420b;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(booleanValue);
            ea3.p pVar = ((ea3.C28286x337571) y0Var).f332201a;
            if (!pVar.f332186i) {
                boolean i17 = pVar.i();
                pVar.f332186i = i17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "doNotifyMediaItemsChangedJob: checkMediaStorage=%s", java.lang.Boolean.valueOf(i17));
                if (pVar.f332186i) {
                    pVar.j();
                }
            }
            pVar.E = c15630x7d8d0183;
            ea3.a0 a0Var = new ea3.a0(null);
            a0Var.f332129d = new java.lang.ref.WeakReference(pVar.f332195u);
            a0Var.f332130e = new java.lang.ref.WeakReference(pVar.f332193s);
            pVar.f332180J = new java.util.LinkedList(list2);
            pVar.r();
            a0Var.f332132g = pVar.K;
            a0Var.f332131f = new java.lang.ref.WeakReference(pVar);
            a0Var.f332134i = pVar.I;
            pVar.I = false;
            a0Var.f332133h = valueOf.booleanValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "doNotifyMediaItemsChangedJob %s %s", pVar.E.f219948d, java.lang.Integer.valueOf(list2.size()));
            a0Var.run();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumMediaQueryServiceImpl", "switchFolderByName: " + a17.f514419a + ", targetBucketId=" + targetBucketId + ", media size=" + a17.f514420b.size());
    }
}
