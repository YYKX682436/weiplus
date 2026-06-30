package rf2;

/* loaded from: classes10.dex */
public final class f1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f476265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.dm4 f476266e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rf2.o1 f476267f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(r45.dm4 dm4Var, rf2.o1 o1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f476266e = dm4Var;
        this.f476267f = o1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rf2.f1(this.f476266e, this.f476267f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rf2.f1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Object Q6;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f476265d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        rf2.o1 o1Var = this.f476267f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.dm4 dm4Var = this.f476266e;
            if (dm4Var == null || (str = dm4Var.f454108m) == null) {
                str = "";
            }
            mm2.v4 v4Var = (mm2.v4) o1Var.f476370b.m56788xbba4bfc0(mm2.v4.class);
            android.content.Context context = o1Var.f476369a.getContext();
            this.f476265d = 1;
            Q6 = v4Var.Q6(str, context, true, this);
            if (Q6 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return f0Var;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            Q6 = obj;
        }
        r45.f02 f02Var = (r45.f02) Q6;
        if (f02Var == null) {
            return f0Var;
        }
        android.view.View view = o1Var.f476369a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$4$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$4$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        df2.ln lnVar = (df2.ln) o1Var.f476370b.m56789x25fe639c(df2.ln.class);
        if (lnVar != null) {
            df2.dn dnVar = df2.dn.f311524e;
            rf2.e1 e1Var = new rf2.e1(o1Var);
            this.f476265d = 2;
            if (lnVar.b7(dnVar, f02Var, false, false, e1Var, this) == aVar) {
                return aVar;
            }
        }
        return f0Var;
    }
}
