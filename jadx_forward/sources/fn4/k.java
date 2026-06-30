package fn4;

/* loaded from: classes15.dex */
public class k implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn4.g f346094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f346095e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.xn6 f346096f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fn4.b f346097g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f346098h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fn4.m f346099i;

    public k(fn4.m mVar, fn4.g gVar, android.content.Context context, r45.xn6 xn6Var, fn4.b bVar, int i17) {
        this.f346099i = mVar;
        this.f346094d = gVar;
        this.f346095e = context;
        this.f346096f = xn6Var;
        this.f346097g = bVar;
        this.f346098h = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        r45.x56 x56Var;
        byte[] bArr;
        r45.x56 x56Var2;
        fn4.m mVar = this.f346099i;
        boolean z17 = mVar.f346119g;
        fn4.b bVar = mVar.f346116d;
        if (z17) {
            bVar.I2().k();
            mVar.f346119g = false;
        }
        bVar.B2();
        int itemId = menuItem.getItemId();
        fn4.b1 b1Var = fn4.b1.f346014b;
        r45.xn6 xn6Var = this.f346096f;
        android.content.Context context = this.f346095e;
        fn4.g gVar = this.f346094d;
        fn4.b bVar2 = this.f346097g;
        if (itemId == 1) {
            gVar.l();
            r45.un6 r07 = bVar2.r0();
            if (xn6Var != null && r07 != null) {
                b1Var.f346015a = xn6Var;
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Ksnsupload_title", xn6Var.f471796o);
                intent.putExtra("Ksnsupload_imgurl", xn6Var.f471799q);
                intent.putExtra("Ksnsupload_link", xn6Var.f471795n);
                intent.putExtra("KContentObjDesc", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xn6Var.f471797p) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hsm) : xn6Var.f471797p);
                intent.putExtra("KlinkThumb_url", xn6Var.f471799q);
                intent.putExtra("Ksnsupload_source", 1);
                intent.putExtra("Ksnsupload_type", 16);
                intent.putExtra("need_result", true);
                r45.y97 y97Var = new r45.y97();
                y97Var.f472431d = xn6Var.f471792h;
                y97Var.f472432e = xn6Var.f471806x;
                y97Var.f472433f = r07.f469040m;
                y97Var.f472434g = xn6Var.f471805w;
                y97Var.f472435h = 100201L;
                y97Var.f472437m = xn6Var.f471795n;
                y97Var.f472438n = xn6Var.f471796o;
                y97Var.f472439o = xn6Var.f471797p;
                y97Var.f472440p = xn6Var.f471799q;
                y97Var.f472441q = xn6Var.f471800r;
                y97Var.f472442r = xn6Var.f471801s;
                y97Var.f472443s = xn6Var.f471802t;
                y97Var.f472444t = xn6Var.f471803u;
                y97Var.f472436i = xn6Var.f471807y;
                y97Var.f472445u = xn6Var.f471808z;
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.addAll(r07.f469044q);
                linkedList.addAll(xn6Var.W);
                y97Var.f472446v = b1Var.c(linkedList).toString();
                y97Var.f472447w = pm4.w.s(xn6Var.D).toString();
                long j17 = xn6Var.M;
                y97Var.f472448x = j17;
                y97Var.f472449y = xn6Var.f471790f;
                if (((j17 == 100201 || j17 == 100203) ? false : true) && (x56Var2 = r07.f469043p) != null) {
                    y97Var.f472450z = x56Var2.f471333i;
                }
                try {
                    bArr = y97Var.mo14344x5f01b1f6();
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryVideoShareMgr", e17, "", new java.lang.Object[0]);
                    bArr = null;
                }
                if (bArr != null) {
                    intent.putExtra("KWebSearchInfo", bArr);
                }
                j45.l.n(context, "sns", ".ui.SnsUploadUI", intent, 1024);
            }
            ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).Ai().a(bVar2.r0(), this.f346096f, this.f346098h, 7, "");
            return;
        }
        if (menuItem.getItemId() == 0) {
            gVar.l();
            r45.un6 r08 = bVar2.r0();
            b1Var.f346015a = xn6Var;
            ot0.q qVar = new ot0.q();
            qVar.f430199i = 5;
            qVar.f430187f = xn6Var.f471796o;
            qVar.f430191g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xn6Var.f471797p) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hsm) : xn6Var.f471797p;
            java.lang.String str = xn6Var.f471795n;
            qVar.f430207k = str;
            java.lang.String str2 = xn6Var.f471799q;
            qVar.f430267z = str2;
            su4.l2 l2Var = new su4.l2();
            l2Var.f494516b = xn6Var.f471792h;
            l2Var.f494517c = xn6Var.f471806x;
            l2Var.f494518d = r08.f469040m;
            l2Var.f494519e = xn6Var.f471805w;
            l2Var.f494520f = 100201L;
            l2Var.f494521g = str;
            l2Var.f494522h = xn6Var.f471796o;
            l2Var.f494523i = xn6Var.f471797p;
            l2Var.f494524j = str2;
            l2Var.f494525k = xn6Var.f471800r;
            l2Var.f494526l = xn6Var.f471801s;
            l2Var.f494527m = xn6Var.f471802t;
            l2Var.f494528n = xn6Var.f471803u;
            l2Var.f494529o = xn6Var.f471807y;
            l2Var.f494530p = xn6Var.f471808z;
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            linkedList2.addAll(r08.f469044q);
            linkedList2.addAll(xn6Var.W);
            l2Var.f494531q = b1Var.c(linkedList2).toString();
            l2Var.f494532r = pm4.w.s(xn6Var.D).toString();
            long j18 = xn6Var.M;
            l2Var.f494533s = j18;
            l2Var.f494534t = xn6Var.f471790f;
            if (((j18 == 100201 || j18 == 100203) ? false : true) && (x56Var = r08.f469043p) != null) {
                l2Var.f494535u = x56Var.f471333i;
            }
            qVar.f(l2Var);
            java.lang.String u17 = ot0.q.u(qVar, null, null);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Retr_Msg_Type", 2);
            intent2.putExtra("Retr_Msg_content", u17);
            intent2.putExtra("Multi_Retr", true);
            intent2.putExtra("Retr_go_to_chattingUI", false);
            intent2.putExtra("Retr_show_success_tips", true);
            j45.l.v(context, ".ui.transmit.MsgRetransmitUI", intent2, 2048);
            ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).Ai().a(bVar2.r0(), this.f346096f, this.f346098h, 6, "");
        }
    }
}
