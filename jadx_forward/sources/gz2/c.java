package gz2;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final gz2.c f359261a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f359262b;

    /* renamed from: c, reason: collision with root package name */
    public static r45.el0 f359263c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f359264d;

    static {
        gz2.c cVar = new gz2.c();
        f359261a = cVar;
        f359263c = cVar.b();
        f359264d = "";
        com.p314xaae8f345.mm.app.w.INSTANCE.a(new gz2.a());
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) context).registerActivityLifecycleCallbacks(new gz2.b());
    }

    public static final void a(java.lang.String scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        r45.dm0 f17 = f359261a.f(scene);
        if (f17 == null) {
            return;
        }
        f17.set(1, java.lang.Integer.valueOf(f17.m75939xb282bd08(1) + 1));
    }

    public static final void e(java.lang.String scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        r45.dm0 f17 = f359261a.f(scene);
        if (f17 == null) {
            return;
        }
        f17.set(2, java.lang.Integer.valueOf(f17.m75939xb282bd08(2) + 1));
    }

    public final r45.el0 b() {
        r45.el0 el0Var = new r45.el0();
        el0Var.set(0, new r45.dm0());
        el0Var.set(2, new r45.dm0());
        el0Var.set(1, new r45.dm0());
        return el0Var;
    }

    public final void c(java.lang.String scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        r45.dm0 f17 = f(scene);
        if (f17 != null && f17.m75942xfb822ef2(4) == 0) {
            f17.set(4, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
    }

    public final void d(java.lang.String scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        r45.dm0 f17 = f(scene);
        if (f17 != null && f17.m75942xfb822ef2(4) > 0) {
            f17.set(3, java.lang.Integer.valueOf(f17.m75939xb282bd08(3) + ((int) ((java.lang.System.currentTimeMillis() - f17.m75942xfb822ef2(4)) / 1000))));
            f17.set(4, 0L);
        }
    }

    public final r45.dm0 f(java.lang.String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1274447834) {
            if (hashCode != 114040) {
                if (hashCode == 3322092 && str.equals("live")) {
                    return (r45.dm0) f359263c.m75936x14adae67(2);
                }
            } else if (str.equals("sns")) {
                return (r45.dm0) f359263c.m75936x14adae67(0);
            }
        } else if (str.equals("finder")) {
            return (r45.dm0) f359263c.m75936x14adae67(1);
        }
        return null;
    }

    public final r45.el0 g(int i17) {
        r45.el0 el0Var = f359263c;
        el0Var.set(3, java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() / 1000)));
        r45.f03 I0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0("FinderEntrance");
        r45.dm0 dm0Var = (r45.dm0) el0Var.m75936x14adae67(1);
        if (dm0Var != null) {
            dm0Var.set(0, java.lang.Integer.valueOf(I0 == null ? 0 : 1));
        }
        r45.f03 I02 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0("FinderLiveEntrance");
        r45.dm0 dm0Var2 = (r45.dm0) el0Var.m75936x14adae67(2);
        if (dm0Var2 != null) {
            dm0Var2.set(0, java.lang.Integer.valueOf(I02 == null ? 0 : 1));
        }
        r45.dm0 dm0Var3 = (r45.dm0) el0Var.m75936x14adae67(0);
        if (dm0Var3 != null) {
            dm0Var3.set(0, java.lang.Integer.valueOf(f359262b ? 1 : 0));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[take#");
        sb6.append(i17);
        sb6.append("] ");
        sb6.append(el0Var.m75939xb282bd08(3));
        sb6.append(" sns=");
        r45.dm0 dm0Var4 = (r45.dm0) el0Var.m75936x14adae67(0);
        sb6.append(dm0Var4 != null ? gz2.d.a(dm0Var4) : null);
        sb6.append(" live=");
        r45.dm0 dm0Var5 = (r45.dm0) el0Var.m75936x14adae67(2);
        sb6.append(dm0Var5 != null ? gz2.d.a(dm0Var5) : null);
        sb6.append(" finder=");
        r45.dm0 dm0Var6 = (r45.dm0) el0Var.m75936x14adae67(1);
        sb6.append(dm0Var6 != null ? gz2.d.a(dm0Var6) : null);
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("FindMoreFriendEntranceExpose", sb6.toString());
        r45.el0 b17 = b();
        r45.dm0 dm0Var7 = (r45.dm0) b17.m75936x14adae67(0);
        if (dm0Var7 != null) {
            r45.dm0 dm0Var8 = (r45.dm0) f359263c.m75936x14adae67(0);
            dm0Var7.set(4, java.lang.Long.valueOf(dm0Var8 != null ? dm0Var8.m75942xfb822ef2(4) : 0L));
        }
        r45.dm0 dm0Var9 = (r45.dm0) b17.m75936x14adae67(1);
        if (dm0Var9 != null) {
            r45.dm0 dm0Var10 = (r45.dm0) f359263c.m75936x14adae67(1);
            dm0Var9.set(4, java.lang.Long.valueOf(dm0Var10 != null ? dm0Var10.m75942xfb822ef2(4) : 0L));
        }
        r45.dm0 dm0Var11 = (r45.dm0) b17.m75936x14adae67(2);
        if (dm0Var11 != null) {
            r45.dm0 dm0Var12 = (r45.dm0) f359263c.m75936x14adae67(2);
            dm0Var11.set(4, java.lang.Long.valueOf(dm0Var12 != null ? dm0Var12.m75942xfb822ef2(4) : 0L));
        }
        f359263c = b17;
        return el0Var;
    }
}
