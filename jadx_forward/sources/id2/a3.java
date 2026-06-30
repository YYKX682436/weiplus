package id2;

/* loaded from: classes3.dex */
public final class a3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f372012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f372013e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f372014f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(az2.f fVar, id2.u3 u3Var, android.content.Context context) {
        super(1);
        this.f372012d = fVar;
        this.f372013e = u3Var;
        this.f372014f = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f result = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        this.f372012d.b();
        int i17 = result.f152148a;
        if ((i17 == 0 && result.f152149b == 0) || hc2.p.b(i17, result.f152149b)) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) result.f152151d).m75936x14adae67(2);
            if (c19792x256d2725 != null) {
                r45.nw1 m76794xd0557130 = c19792x256d2725.m76794xd0557130();
                if (m76794xd0557130 != null) {
                    r45.i72 i72Var = (r45.i72) m76794xd0557130.m75936x14adae67(44);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePersonalCente", "jump to replay feed " + (i72Var != null ? i72Var.m75942xfb822ef2(12) : 0L));
                    p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(this.f372013e.m158354x19263085()), null, null, new id2.q2(m76794xd0557130, this.f372014f, null), 3, null);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePersonalCente", "get common detail success, but liveInfo is null");
                }
            }
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cgiGetFinderFeedComment errType:");
            sb6.append(result.f152148a);
            sb6.append(", errCode:");
            sb6.append(result.f152149b);
            sb6.append(",errMsg:");
            java.lang.String str = result.f152150c;
            if (str == null) {
                str = "";
            }
            sb6.append(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePersonalCente", sb6.toString());
        }
        return jz5.f0.f384359a;
    }
}
