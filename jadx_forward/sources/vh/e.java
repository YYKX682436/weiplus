package vh;

/* loaded from: classes12.dex */
public class e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f518317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.ActivityC4641x313ebfe1 f518318e;

    public e(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.ActivityC4641x313ebfe1 activityC4641x313ebfe1, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de) {
        this.f518318e = activityC4641x313ebfe1;
        this.f518317d = c1162x665295de;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        boolean z17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = this.f518317d;
        int w17 = c1162x665295de.w();
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.ActivityC4641x313ebfe1 activityC4641x313ebfe1 = this.f518318e;
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.ActivityC4641x313ebfe1.O6(activityC4641x313ebfe1, w17);
        if (c1162x665295de.y() == ((java.util.ArrayList) activityC4641x313ebfe1.f134155d.f518358a.f518352d).size() - 1) {
            vh.y yVar = activityC4641x313ebfe1.f134155d;
            if (java.lang.Math.abs(yVar.f518361d) >= yVar.f518359b) {
                z17 = false;
            } else {
                int i19 = yVar.f518361d - 1;
                yVar.f518361d = i19;
                ph.a.b(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k.class, new vh.u(yVar, i19));
                z17 = true;
            }
            if (z17 || activityC4641x313ebfe1.f134157f) {
                return;
            }
            activityC4641x313ebfe1.f134157f = true;
        }
    }
}
