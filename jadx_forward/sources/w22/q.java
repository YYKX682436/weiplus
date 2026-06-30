package w22;

/* loaded from: classes10.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w22.v f524103d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(w22.v vVar) {
        super(0);
        this.f524103d = vVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        w22.v vVar = this.f524103d;
        if (vVar.f524120h && vVar.f524121i) {
            r22.d dVar = vVar.f524114b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.C13390xb12545d7 f180230h = dVar.getF180230h();
            if (f180230h != null) {
                f180230h.m54884x3a205154(vVar.f524123k);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.C13390xb12545d7 f180230h2 = dVar.getF180230h();
            if (f180230h2 != null) {
                f180230h2.m54886x4093927b(vVar.f524125m.f505511e);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13397xbda8fd8e c13397xbda8fd8e = (com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13397xbda8fd8e) dVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.C13390xb12545d7 c13390xb12545d7 = c13397xbda8fd8e.f180230h;
            if (c13390xb12545d7 != null) {
                c13390xb12545d7.setAlpha(1.0f);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141 c13384x547d8141 = c13397xbda8fd8e.f180228f;
            if (c13384x547d8141 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("reporter");
                throw null;
            }
            c13384x547d8141.f180119g = java.lang.System.currentTimeMillis();
            y22.m mVar = (y22.m) vVar.f524115c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.ActivityC13388xb8f672d4 activityC13388xb8f672d4 = mVar.f540637b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13388xb8f672d4.f180139d, "onEditorPrepared");
            if (activityC13388xb8f672d4.f180144i == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13397xbda8fd8e c13397xbda8fd8e2 = activityC13388xb8f672d4.f180141f;
                if (c13397xbda8fd8e2 != null) {
                    c13397xbda8fd8e2.setAlpha(1.0f);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb c13392x8bacb7fb = activityC13388xb8f672d4.f180140e;
                if (c13392x8bacb7fb != null) {
                    c13392x8bacb7fb.setVisibility(8);
                }
                mVar.b();
                activityC13388xb8f672d4.f180144i = 1;
            }
            w22.v.a(vVar, vVar.f524118f, vVar.f524119g, true);
            u22.b bVar = vVar.f524125m;
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = bVar.f505515i;
            if (c21053xdbf1e5f4 != null) {
                vVar.b(c21053xdbf1e5f4, bVar.f505516j);
            }
            vVar.f524121i = false;
            vVar.f524120h = false;
        }
        return jz5.f0.f384359a;
    }
}
