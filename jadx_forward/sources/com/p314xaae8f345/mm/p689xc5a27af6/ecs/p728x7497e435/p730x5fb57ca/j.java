package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca;

/* loaded from: classes15.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public int f147309a = 0;

    public java.lang.Character a(int i17) {
        char c17 = (char) i17;
        if ((Integer.MIN_VALUE & i17) != 0) {
            int i18 = i17 & Integer.MAX_VALUE;
            int i19 = this.f147309a;
            if (i19 != 0) {
                this.f147309a = android.view.KeyCharacterMap.getDeadChar(i19, i18);
            } else {
                this.f147309a = i18;
            }
        } else {
            int i27 = this.f147309a;
            if (i27 != 0) {
                int deadChar = android.view.KeyCharacterMap.getDeadChar(i27, i17);
                if (deadChar > 0) {
                    c17 = (char) deadChar;
                }
                this.f147309a = 0;
            }
        }
        return java.lang.Character.valueOf(c17);
    }
}
