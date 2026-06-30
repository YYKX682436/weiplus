package t72;

/* loaded from: classes4.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f497597d;

    /* renamed from: e, reason: collision with root package name */
    public int f497598e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f497599f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f497600g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t72.l f497601h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long j17, int i17, t72.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f497599f = j17;
        this.f497600g = i17;
        this.f497601h = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new t72.i(this.f497599f, this.f497600g, this.f497601h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((t72.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f497598e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fav_tags_prefix_");
            long j17 = this.f497599f;
            sb6.append(j17);
            java.lang.String sb7 = sb6.toString();
            java.util.Set<java.lang.String> stringSet = t72.l.f497605g.getStringSet(sb7, new java.util.HashSet());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[restartBindTagTask] localId = ");
            sb8.append(j17);
            sb8.append(", favId = ");
            int i18 = this.f497600g;
            sb8.append(i18);
            sb8.append(", tags = ");
            sb8.append(stringSet);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTagsManager", sb8.toString());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringSet);
            if (stringSet.size() == 0) {
                return f0Var;
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (java.lang.String str2 : stringSet) {
                t72.b bVar = t72.b.f497573a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                t72.a f17 = bVar.f(str2);
                int i19 = f17 != null ? f17.f68043xc8a07680 : 0;
                r45.hi hiVar = new r45.hi();
                hiVar.f457710e = i19;
                hiVar.f457711f = str2;
                hiVar.f457709d = i18;
                hiVar.f457712g = 1;
                linkedList.add(hiVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTagsManager", "[restartBindTagTask] tag = " + str2 + ", fav id = " + i18 + ", tag id = " + i19);
            }
            this.f497597d = sb7;
            this.f497598e = 1;
            java.lang.Object T6 = this.f497601h.T6(linkedList, this);
            if (T6 == aVar) {
                return aVar;
            }
            str = sb7;
            obj = T6;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.f497597d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            t72.l.f497605g.remove(str);
        }
        return f0Var;
    }
}
