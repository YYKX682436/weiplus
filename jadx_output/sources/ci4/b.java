package ci4;

/* loaded from: classes10.dex */
public final class b extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.uniComments.b f41714d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        jz5.h.b(ci4.a.f41713d);
        new java.util.HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0026 A[RETURN] */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onBackPressed() {
        /*
            r3 = this;
            com.tencent.mm.plugin.finder.uniComments.b r0 = r3.f41714d
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L17
            com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawer r0 = r0.f130202a
            if (r0 == 0) goto L12
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L12
            r0 = r1
            goto L13
        L12:
            r0 = r2
        L13:
            if (r0 != r1) goto L17
            r0 = r1
            goto L18
        L17:
            r0 = r2
        L18:
            if (r0 == 0) goto L26
            com.tencent.mm.plugin.finder.uniComments.b r0 = r3.f41714d
            if (r0 == 0) goto L25
            com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawer r0 = r0.f130202a
            if (r0 == 0) goto L25
            r0.h()
        L25:
            return r1
        L26:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ci4.b.onBackPressed():boolean");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawer textStatusCommentDrawer;
        com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawer textStatusCommentDrawer2;
        com.tencent.mm.plugin.finder.uniComments.b bVar = this.f41714d;
        if (bVar != null && (textStatusCommentDrawer2 = bVar.f130202a) != null) {
            textStatusCommentDrawer2.h();
        }
        com.tencent.mm.plugin.finder.uniComments.b bVar2 = this.f41714d;
        if (bVar2 == null || (textStatusCommentDrawer = bVar2.f130202a) == null) {
            return;
        }
        textStatusCommentDrawer.b();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawer textStatusCommentDrawer;
        com.tencent.mm.plugin.finder.uniComments.b bVar = this.f41714d;
        if (bVar == null || (textStatusCommentDrawer = bVar.f130202a) == null) {
            return;
        }
        textStatusCommentDrawer.k(false);
    }
}
