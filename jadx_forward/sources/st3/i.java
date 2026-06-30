package st3;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final st3.i f494077a = new st3.i();

    public final boolean a(dw3.o0 o0Var) {
        h62.d dVar = (h62.d) ((e42.e0) i95.n0.c(e42.e0.class));
        boolean fj6 = dVar.fj(e42.d0.clicfg_chatting_video_editor_second_cut_promotion_enabled, false);
        boolean fj7 = dVar.fj(e42.d0.clicfg_sns_video_editor_second_cut_promotion_enabled, false);
        boolean fj8 = dVar.fj(e42.d0.clicfg_capture_video_editor_second_cut_promotion_enabled, false);
        int i17 = o0Var == null ? -1 : st3.h.f494076a[o0Var.ordinal()];
        if (i17 == 1) {
            return fj6;
        }
        if (i17 != 2) {
            if (i17 == 3) {
                return fj7;
            }
            if (i17 != 4 || !fj7 || !fj8) {
                return false;
            }
        } else if (!fj6 || !fj8) {
            return false;
        }
        return true;
    }

    public final boolean b(dw3.o0 o0Var, int i17) {
        if (!a(o0Var)) {
            return false;
        }
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        if (i17 == 1) {
            return ((h62.d) e0Var).fj(e42.d0.clicfg_video_editor_emotion_second_cut_promotion_enabled, false);
        }
        if (i17 == 2) {
            return ((h62.d) e0Var).fj(e42.d0.clicfg_video_editor_music_second_cut_promotion_enabled, false);
        }
        if (i17 == 3) {
            return ((h62.d) e0Var).fj(e42.d0.clicfg_video_editor_crop_second_cut_promotion_enabled, false);
        }
        if (i17 != 4) {
            return false;
        }
        return ((h62.d) e0Var).fj(e42.d0.clicfg_video_editor_text_second_cut_promotion_enabled, false);
    }
}
