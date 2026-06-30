package f32;

/* loaded from: classes10.dex */
public final class j implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1384xed08e3c8.C13407x91e79130 f340831a;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1384xed08e3c8.C13407x91e79130 c13407x91e79130) {
        this.f340831a = c13407x91e79130;
    }

    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        u85.o task = (u85.o) dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        java.lang.String str = task.f507252f.f275227i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1384xed08e3c8.C13407x91e79130 c13407x91e79130 = this.f340831a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, c13407x91e79130.f180324J)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13407x91e79130.f180325v, "onLoaderFin: " + status);
            if (status != fp0.u.f346823f) {
                c13407x91e79130.A(null);
                return;
            }
            t85.j jVar = new t85.j();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str2 = u85.i.f507243d;
            sb6.append(str2);
            sb6.append("preview/");
            java.lang.String sb7 = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sb7, "<set-?>");
            jVar.f498009c = sb7;
            jVar.b(str2 + "preview/");
            c13407x91e79130.A(jVar);
        }
    }
}
