package bu2;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final bu2.j f24534a = new bu2.j();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.c0 f24535b = new com.tencent.mm.sdk.platformtools.c0(200);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f24536c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f24537d = new java.util.HashMap();

    public final void a(int i17, java.util.List feeds) {
        kotlin.jvm.internal.o.g(feeds, "feeds");
        java.util.HashMap hashMap = f24536c;
        synchronized (hashMap) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Object obj = hashMap.get(valueOf);
            if (obj == null) {
                obj = new android.util.LongSparseArray();
                hashMap.put(valueOf, obj);
            }
            android.util.LongSparseArray longSparseArray = (android.util.LongSparseArray) obj;
            java.util.Iterator it = feeds.iterator();
            while (it.hasNext()) {
                longSparseArray.put(((com.tencent.mm.protocal.protobuf.FinderObject) it.next()).getId(), java.lang.Long.valueOf(c01.id.c()));
            }
        }
    }

    public final java.lang.String b(com.tencent.mm.protocal.protobuf.FinderObject finderObject, r45.sm2 sm2Var, r45.sm2 sm2Var2) {
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = h(finderObject.getId());
        int commentCount = (h17 == null || (feedObject = h17.getFeedObject()) == null) ? -1 : feedObject.getCommentCount();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("commentCount[local=");
        sb6.append(commentCount);
        sb6.append(" -> yes=");
        sb6.append(sm2Var.getInteger(0));
        sb6.append("](no=");
        sb6.append(sm2Var2 != null ? java.lang.Integer.valueOf(sm2Var2.getInteger(0)) : null);
        sb6.append(')');
        java.lang.String sb7 = sb6.toString();
        finderObject.setCommentCount(sm2Var.getInteger(0));
        g(finderObject).set(1, sm2Var);
        return sb7;
    }

    public final java.lang.String c(com.tencent.mm.protocal.protobuf.FinderObject finderObject, r45.ll2 ll2Var, r45.ll2 ll2Var2) {
        if (cm2.a.f43328a.t(finderObject)) {
            return "live feed cnt not need change by FinderObjectCountInfo";
        }
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = h(finderObject.getId());
        com.tencent.mm.protocal.protobuf.FinderObject feedObject = h17 != null ? h17.getFeedObject() : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("likeCount[local=");
        sb6.append(feedObject != null ? feedObject.getLikeCount() : -1);
        sb6.append(" -> yes=");
        sb6.append(ll2Var.getInteger(0));
        sb6.append("](no=");
        sb6.append(ll2Var2 != null ? java.lang.Integer.valueOf(ll2Var2.getInteger(0)) : null);
        sb6.append(") forwardCount[local=");
        sb6.append(feedObject != null ? feedObject.getForwardCount() : -1);
        sb6.append(" -> yes=");
        sb6.append(ll2Var.getInteger(1));
        sb6.append("](no=");
        sb6.append(ll2Var2 != null ? java.lang.Integer.valueOf(ll2Var2.getInteger(1)) : null);
        sb6.append(") readCount[local=");
        sb6.append(feedObject != null ? feedObject.getReadCount() : -1);
        sb6.append(" -> yes=");
        sb6.append(ll2Var.getInteger(2));
        sb6.append("](no=");
        sb6.append(ll2Var2 != null ? java.lang.Integer.valueOf(ll2Var2.getInteger(2)) : null);
        sb6.append(") favCount[local=");
        sb6.append(feedObject != null ? feedObject.getFavCount() : -1);
        sb6.append(" -> yes=");
        sb6.append(ll2Var.getInteger(3));
        sb6.append("](no=");
        sb6.append(ll2Var2 != null ? java.lang.Integer.valueOf(ll2Var2.getInteger(3)) : null);
        sb6.append(") ");
        java.lang.String sb7 = sb6.toString();
        finderObject.setLikeCount(ll2Var.getInteger(0));
        finderObject.setForwardCount(ll2Var.getInteger(1));
        finderObject.setReadCount(ll2Var.getInteger(2));
        finderObject.setFavCount(ll2Var.getInteger(3));
        g(finderObject).set(0, ll2Var);
        return sb7;
    }

    public final java.lang.String d(com.tencent.mm.protocal.protobuf.FinderObject finderObject, r45.um2 um2Var, r45.um2 um2Var2) {
        r45.pm2 pm2Var;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        r45.dm2 object_extend;
        r45.pm2 pm2Var2;
        r45.um2 um2Var3;
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = h(finderObject.getId());
        int integer = (h17 == null || (feedObject = h17.getFeedObject()) == null || (object_extend = feedObject.getObject_extend()) == null || (pm2Var2 = (r45.pm2) object_extend.getCustom(12)) == null || (um2Var3 = (r45.um2) pm2Var2.getCustom(2)) == null) ? -1 : um2Var3.getInteger(0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("globalFavCount[local=");
        sb6.append(integer);
        sb6.append(" -> yes=");
        sb6.append(um2Var.getInteger(0));
        sb6.append("](no=");
        r45.um2 um2Var4 = null;
        sb6.append(um2Var2 != null ? java.lang.Integer.valueOf(um2Var2.getInteger(0)) : null);
        sb6.append(')');
        java.lang.String sb7 = sb6.toString();
        r45.dm2 object_extend2 = finderObject.getObject_extend();
        if (object_extend2 != null && (pm2Var = (r45.pm2) object_extend2.getCustom(12)) != null) {
            um2Var4 = (r45.um2) pm2Var.getCustom(2);
        }
        if (um2Var4 != null) {
            um2Var4.set(0, java.lang.Integer.valueOf(um2Var.getInteger(0)));
        }
        g(finderObject).set(2, um2Var);
        return sb7;
    }

    public final java.lang.String e(com.tencent.mm.protocal.protobuf.FinderObject finderObject, r45.ym2 ym2Var, r45.ym2 ym2Var2) {
        r45.pm2 pm2Var;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        r45.dm2 object_extend;
        r45.pm2 pm2Var2;
        r45.ym2 ym2Var3;
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = h(finderObject.getId());
        int integer = (h17 == null || (feedObject = h17.getFeedObject()) == null || (object_extend = feedObject.getObject_extend()) == null || (pm2Var2 = (r45.pm2) object_extend.getCustom(12)) == null || (ym2Var3 = (r45.ym2) pm2Var2.getCustom(4)) == null) ? -1 : ym2Var3.getInteger(0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("thumbUpCount[local=");
        sb6.append(integer);
        sb6.append(" -> yes=");
        sb6.append(ym2Var.getInteger(0));
        sb6.append("](no=");
        r45.ym2 ym2Var4 = null;
        sb6.append(ym2Var2 != null ? java.lang.Integer.valueOf(ym2Var2.getInteger(0)) : null);
        sb6.append(')');
        java.lang.String sb7 = sb6.toString();
        r45.dm2 object_extend2 = finderObject.getObject_extend();
        if (object_extend2 != null && (pm2Var = (r45.pm2) object_extend2.getCustom(12)) != null) {
            ym2Var4 = (r45.ym2) pm2Var.getCustom(4);
        }
        if (ym2Var4 != null) {
            ym2Var4.set(0, java.lang.Integer.valueOf(ym2Var.getInteger(0)));
        }
        g(finderObject).set(4, ym2Var);
        return sb7;
    }

    public final java.lang.String f(com.tencent.mm.protocal.protobuf.FinderObject finderObject, r45.zm2 zm2Var, r45.zm2 zm2Var2) {
        r45.pm2 pm2Var;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        r45.dm2 object_extend;
        r45.pm2 pm2Var2;
        r45.zm2 zm2Var3;
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = h(finderObject.getId());
        int integer = (h17 == null || (feedObject = h17.getFeedObject()) == null || (object_extend = feedObject.getObject_extend()) == null || (pm2Var2 = (r45.pm2) object_extend.getCustom(12)) == null || (zm2Var3 = (r45.zm2) pm2Var2.getCustom(5)) == null) ? 0 : zm2Var3.getInteger(0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("thumbUpFlag[local=");
        sb6.append(integer);
        sb6.append(" -> yes=");
        sb6.append(zm2Var.getInteger(0));
        sb6.append("](no=");
        r45.zm2 zm2Var4 = null;
        sb6.append(zm2Var2 != null ? java.lang.Integer.valueOf(zm2Var2.getInteger(0)) : null);
        sb6.append(')');
        java.lang.String sb7 = sb6.toString();
        r45.dm2 object_extend2 = finderObject.getObject_extend();
        if (object_extend2 != null && (pm2Var = (r45.pm2) object_extend2.getCustom(12)) != null) {
            zm2Var4 = (r45.zm2) pm2Var.getCustom(5);
        }
        if (zm2Var4 != null) {
            zm2Var4.set(0, java.lang.Integer.valueOf(zm2Var.getInteger(0)));
        }
        g(finderObject).set(5, zm2Var);
        return sb7;
    }

    public final r45.pm2 g(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        r45.dm2 object_extend;
        if (finderObject.getObject_extend() == null) {
            finderObject.setObject_extend(new r45.dm2());
        }
        r45.dm2 object_extend2 = finderObject.getObject_extend();
        if ((object_extend2 != null ? (r45.pm2) object_extend2.getCustom(12) : null) == null && (object_extend = finderObject.getObject_extend()) != null) {
            object_extend.set(12, new r45.pm2());
        }
        r45.dm2 object_extend3 = finderObject.getObject_extend();
        r45.pm2 pm2Var = object_extend3 != null ? (r45.pm2) object_extend3.getCustom(12) : null;
        kotlin.jvm.internal.o.d(pm2Var);
        return pm2Var;
    }

    public final com.tencent.mm.plugin.finder.storage.FinderItem h(long j17) {
        return (com.tencent.mm.plugin.finder.storage.FinderItem) f24535b.b(java.lang.Long.valueOf(j17));
    }

    public final boolean i(int i17, long j17) {
        boolean z17;
        java.util.HashMap hashMap = f24537d;
        synchronized (hashMap) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Object obj = hashMap.get(valueOf);
            if (obj == null) {
                obj = new android.util.LongSparseArray();
                hashMap.put(valueOf, obj);
            }
            z17 = ((android.util.LongSparseArray) obj).indexOfKey(j17) >= 0;
        }
        return z17;
    }

    public final boolean j(long j17, bu2.i iVar) {
        return j17 != 0 && (iVar instanceof bu2.h);
    }

    public final int k(r45.jn2 jn2Var, r45.jn2 jn2Var2) {
        if (jn2Var != null && jn2Var.getBoolean(1)) {
            return 0;
        }
        long j17 = jn2Var != null ? jn2Var.getLong(0) : -1L;
        long j18 = jn2Var2 != null ? jn2Var2.getLong(0) : -1L;
        if (j17 > j18) {
            return 1;
        }
        return j17 == j18 ? -1 : -1000;
    }

    public final boolean l(long j17) {
        f24535b.e(java.lang.Long.valueOf(j17));
        return true;
    }

    public final java.lang.String m(int i17) {
        return i17 != -1000 ? i17 != -100 ? i17 != -1 ? i17 != 0 ? "(newVersion>oldVersion)" : "(override)" : "(newVersion=oldVersion)" : "(monotonic_data=null)" : "(newVersion<oldVersion)";
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        if ((r4 != null && r4.getInteger(2) == 6) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ea, code lost:
    
        if (j(r28.getExpectId(), r29) != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(com.tencent.mm.plugin.finder.storage.FinderItem r28, bu2.i r29) {
        /*
            Method dump skipped, instructions count: 2388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bu2.j.n(com.tencent.mm.plugin.finder.storage.FinderItem, bu2.i):boolean");
    }

    public final boolean o(com.tencent.mm.plugin.finder.storage.FinderItem item, bu2.i source) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(source, "source");
        if (f24535b.b(java.lang.Long.valueOf(item.field_id)) == null) {
            return n(item, source);
        }
        return false;
    }
}
