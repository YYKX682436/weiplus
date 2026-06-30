package ws2;

/* loaded from: classes3.dex */
public final class p1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14931xe48fc583 f530653d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14931xe48fc583 c14931xe48fc583) {
        super(4);
        this.f530653d = c14931xe48fc583;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        jz5.f0 f0Var;
        long j17;
        java.lang.String str;
        long j18;
        jz5.f0 f0Var2;
        km2.m a17;
        km2.m a18;
        ct2.j jVar;
        ct2.j jVar2;
        ct2.j jVar3;
        int intValue = ((java.lang.Number) obj).intValue();
        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((android.view.View) obj2, "<anonymous parameter 1>");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14931xe48fc583 c14931xe48fc583 = this.f530653d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14329x76e637f1 c14329x76e637f1 = c14931xe48fc583.f206416i;
        android.view.View mo7935xa188593e = c14329x76e637f1 != null ? c14329x76e637f1.mo7935xa188593e(intValue) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("selectItemView onItemSelected pos:");
        sb6.append(intValue);
        sb6.append(",itemView is null:");
        boolean z17 = false;
        sb6.append(mo7935xa188593e == null);
        sb6.append(",reSelect:");
        sb6.append(booleanValue);
        sb6.append('!');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayViewCallback", sb6.toString());
        jz5.f0 f0Var3 = jz5.f0.f384359a;
        if (mo7935xa188593e == null) {
            return f0Var3;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14929x59565fb6 c14929x59565fb6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14929x59565fb6) mo7935xa188593e.findViewById(com.p314xaae8f345.mm.R.id.fk9);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayViewCallback", "updateLayoutManager:" + intValue + ", pluginLayout:" + c14929x59565fb6.hashCode() + ",reStart:" + booleanValue + '!');
        ws2.v1 v1Var = c14931xe48fc583.f206418n;
        v1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayViewCallback", "before update plugins,pos:" + v1Var.f530683b + ' ' + v1Var.f530682a + ' ' + c14929x59565fb6);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14929x59565fb6 c14929x59565fb62 = v1Var.f530682a;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("replay_step100:deactivate plugin pos:");
        sb7.append(v1Var.f530683b);
        sb7.append('(');
        sb7.append(c14929x59565fb62 != null ? c14929x59565fb62.hashCode() : 0);
        sb7.append(")!");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayViewCallback", sb7.toString());
        ct2.e eVar = (ct2.e) pf5.u.f435469a.e(zy2.b6.class).a(ct2.e.class);
        if (c14929x59565fb62 == null || (jVar3 = (ct2.j) c14929x59565fb62.m57635xbba4bfc0(ct2.j.class)) == null) {
            f0Var = f0Var3;
            j17 = 0;
        } else {
            f0Var = f0Var3;
            j17 = jVar3.O6();
        }
        eVar.N6(j17, (c14929x59565fb62 == null || (jVar2 = (ct2.j) c14929x59565fb62.m57635xbba4bfc0(ct2.j.class)) == null) ? 0 : jVar2.f303806q);
        if (c14929x59565fb62 != null) {
            c14929x59565fb62.r();
            c14929x59565fb62.mo46559xed5f7500();
        }
        ws2.u0 u0Var = ws2.k1.f530599r;
        ws2.k1 a19 = u0Var.a();
        if (c14929x59565fb62 == null || (jVar = (ct2.j) c14929x59565fb62.m57635xbba4bfc0(ct2.j.class)) == null) {
            str = ")!";
            j18 = 0;
        } else {
            long O6 = jVar.O6();
            str = ")!";
            j18 = O6;
        }
        a19.l(8, j18, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayViewCallback", "after deactivate plugin!");
        v1Var.f530682a = c14929x59565fb6;
        v1Var.f530683b = intValue;
        zs2.c cVar = u0Var.a().f530603b;
        if (cVar != null) {
            cVar.b(intValue);
        }
        if (((mm2.e1) c14929x59565fb6.m57654xd7793f26().a(mm2.e1.class)).f410521r.m75942xfb822ef2(0) == 0) {
            zs2.c cVar2 = u0Var.a().f530603b;
            if (cVar2 != null && (a18 = cVar2.a()) != null) {
                ws2.n1.f530638a.c(a18, 2);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayViewCallback", "replay_step2-2-1#:recoverFromLiveConfig!");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayViewCallback", "replay_step2-2:activate liveId:" + ((ct2.j) c14929x59565fb6.m57635xbba4bfc0(ct2.j.class)).O6() + ", plugin pos:" + v1Var.f530683b + '(' + c14929x59565fb6.hashCode() + str);
        u0Var.a().o(c14929x59565fb6.m57654xd7793f26(), new zs2.a());
        android.content.Context context = c14929x59565fb6.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            boolean booleanExtra = activity.getIntent().getBooleanExtra("KEY_PARAMS_IS_LIVING", false);
            int intExtra = activity.getIntent().getIntExtra("KEY_PARAMS_START_OFFSET", 0);
            java.lang.String stringExtra = activity.getIntent().getStringExtra("KEY_PARAMS_REPLAY_SONG_ID");
            if (stringExtra == null) {
                stringExtra = "";
            }
            java.lang.String stringExtra2 = activity.getIntent().getStringExtra("KEY_PARAMS_REPLAY_SONG_NAME");
            java.lang.String str2 = stringExtra2 != null ? stringExtra2 : "";
            ct2.j jVar4 = (ct2.j) u0Var.a().e(ct2.j.class);
            if (jVar4 != null) {
                jVar4.f303813x = booleanExtra;
            }
            ct2.d dVar = (ct2.d) u0Var.a().e(ct2.d.class);
            if (dVar != null) {
                dVar.Q6(intExtra);
            }
            ct2.j jVar5 = (ct2.j) u0Var.a().e(ct2.j.class);
            if (jVar5 != null) {
                jVar5.f303814y = stringExtra;
            }
            ct2.j jVar6 = (ct2.j) u0Var.a().e(ct2.j.class);
            if (jVar6 != null) {
                jVar6.f303815z = str2;
            }
        }
        int i17 = ((ct2.j) c14929x59565fb6.m57654xd7793f26().a(ct2.j.class)).f303813x ? 4 : 1;
        ws2.k1 a27 = u0Var.a();
        ws2.b liveMsgOffsetProcess = (ws2.b) ((jz5.n) new ws2.h(u0Var.a(), new zs2.f(i17)).f530578c).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveMsgOffsetProcess, "liveMsgOffsetProcess");
        a27.f530617p = liveMsgOffsetProcess;
        zs2.c cVar3 = u0Var.a().f530603b;
        if (cVar3 == null || (a17 = cVar3.a()) == null) {
            f0Var2 = null;
        } else {
            zs2.c cVar4 = u0Var.a().f530603b;
            if (cVar4 != null) {
                long O62 = ((ct2.j) c14929x59565fb6.m57635xbba4bfc0(ct2.j.class)).O6();
                jz5.l lVar = cVar4.f556782d;
                if (lVar != null && ((java.lang.Number) lVar.f384366d).longValue() == O62) {
                    z17 = ((java.lang.Boolean) lVar.f384367e).booleanValue();
                }
            }
            c14929x59565fb6.mo57461x9d4bd4f3(a17, z17, booleanValue);
            f0Var2 = f0Var;
        }
        if (f0Var2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveReplayViewCallback", "replay_step2-2-1#:FinderLiveData is null!");
        }
        c14929x59565fb6.mo46547x6343c19();
        u0Var.a().p(c14929x59565fb6, qs5.o.f447988h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayViewCallback", "after activate plugin!");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayViewCallback", "after update plugins,pos:" + v1Var.f530683b);
        return f0Var;
    }
}
