package i53;

/* loaded from: classes8.dex */
public class n2 implements vl1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i53.w2 f370209a;

    public n2(i53.w2 w2Var) {
        this.f370209a = w2Var;
    }

    @Override // vl1.p
    public void a(android.view.View view, int i17, long j17) {
        p33.l lVar;
        i53.w2 w2Var = this.f370209a;
        i53.k0 k0Var = w2Var.f370305g.f370204e2;
        if (i17 >= 0) {
            java.util.LinkedList linkedList = k0Var.f370160i;
            if (i17 < linkedList.size()) {
                lVar = (p33.l) linkedList.get(i17);
                if (!lVar.f433136e || lVar.f433137f) {
                }
                if (w2Var.f370310o) {
                    if (lVar.f433135d) {
                        ((i53.x3) ((m33.v1) i95.n0.c(m33.v1.class))).Ai(w2Var.getContext(), 6, lVar.f433147s, lVar.f433140i, null, null, w2Var.f370308m, null, w2Var.f370311p);
                        return;
                    } else {
                        ((i53.x3) ((m33.v1) i95.n0.c(m33.v1.class))).Ai(w2Var.getContext(), 6, lVar.f433147s, null, lVar.f433140i, lVar.f433139h, w2Var.f370308m, null, w2Var.f370311p);
                        return;
                    }
                }
                android.content.Intent intent = new android.content.Intent();
                p33.m mVar = new p33.m();
                java.util.LinkedList linkedList2 = w2Var.f370302d.f370253e;
                mVar.f433155d = linkedList2;
                int indexOf = linkedList2.indexOf(lVar);
                try {
                    intent.putExtra("game_video_list", mVar.mo14344x5f01b1f6());
                    intent.putExtra("game_video_list_current_index", indexOf);
                    p33.q qVar = w2Var.f370302d.f370251c;
                    intent.putExtra("game_video_has_next", qVar != null && qVar.f433167g);
                    intent.putExtra("game_video_preview_source", i53.g4.FROM_TAB_GALLERY);
                    intent.putExtra("game_haowan_source_scene_id", w2Var.f370311p);
                    j45.l.n(w2Var.getContext(), "game", ".media.preview.GameVideoPreviewUI", intent, w2Var.f370308m);
                    return;
                } catch (java.io.IOException unused) {
                    return;
                }
            }
        } else {
            k0Var.getClass();
        }
        lVar = null;
        if (lVar.f433136e) {
        }
    }
}
