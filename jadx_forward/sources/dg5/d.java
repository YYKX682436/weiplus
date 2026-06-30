package dg5;

/* loaded from: classes11.dex */
public class d implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dg5.g f313891d;

    public d(dg5.g gVar) {
        this.f313891d = gVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        dg5.g gVar = this.f313891d;
        if (itemId == 0) {
            long j17 = gVar.f313901m;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizChatConversationPresenter", "deleteChatroom");
            r01.q3.Ui().z0(j17);
            gVar.f313897f = false;
            dg5.i iVar = gVar.f313902n;
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8 = iVar.f313903d;
            gVar.f313898g = db5.e1.Q(activityC22359x66709fa8, activityC22359x66709fa8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), iVar.f313903d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new dg5.e(gVar));
            gm0.j1.e().j(new c01.h0(gVar.f313900i, j17, new dg5.f(gVar, j17)));
            return;
        }
        if (itemId == 1) {
            s01.b J0 = r01.q3.aj().J0(gVar.f313901m);
            J0.f69079xa35b5abb = 1;
            J0.f69063x49a5aa57 = 0;
            J0.f69062x28d584e9 = 0;
            r01.q3.aj().n1(J0);
            ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).Bi(true, J0.f69065x75756b18, true);
            return;
        }
        if (itemId == 2) {
            r01.q3.aj().o1(gVar.f313901m);
            s01.b J02 = r01.q3.aj().J0(gVar.f313901m);
            ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).Bi(true, J02.f69065x75756b18, false);
            return;
        }
        if (itemId != 3) {
            if (itemId != 4) {
                return;
            }
            com.p314xaae8f345.mm.ui.o3.b(gVar.f313902n.f313903d, new dg5.c(this));
            return;
        }
        s01.b J03 = r01.q3.aj().J0(gVar.f313901m);
        s01.g aj6 = r01.q3.aj();
        if (aj6.f1(aj6.J0(gVar.f313901m))) {
            dg5.g.a(gVar, false, 16);
            r01.q3.aj().k1(gVar.f313901m);
            ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).Ai(true, J03.f69065x75756b18, false);
            return;
        }
        dg5.g.a(gVar, true, 16);
        r01.q3.aj().i1(gVar.f313901m);
        ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).Ai(true, J03.f69065x75756b18, true);
    }
}
