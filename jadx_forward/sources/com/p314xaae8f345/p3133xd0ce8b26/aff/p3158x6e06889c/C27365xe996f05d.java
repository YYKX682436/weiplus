package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.AchievementInfo */
/* loaded from: classes4.dex */
public class C27365xe996f05d extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d f59674xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d();

    /* renamed from: game_achievements */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement> f59675x6b50ee51 = new java.util.LinkedList<>();

    /* renamed from: com.tencent.wechat.aff.newlife.AchievementInfo$GameAchievement */
    /* loaded from: classes4.dex */
    public static class GameAchievement extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

        /* renamed from: DEFAULT_INSTANCE */
        private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement f59676xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement();

        /* renamed from: game_name */
        public java.lang.String f59679x3ba98eb8 = "";

        /* renamed from: game_icon */
        public java.lang.String f59678x3ba750a6 = "";

        /* renamed from: title_icon */
        public java.lang.String f59680x96478a00 = "";

        /* renamed from: description */
        public java.lang.String f59677x993583fc = "";

        /* renamed from: title_icon_hd */
        public java.lang.String f59681x2f15a79b = "";

        /* renamed from: create */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement m113681xaf65a0fc() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement();
        }

        /* renamed from: getDefaultInstance */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement m113682x7c90cfc0() {
            return f59676xb3e828f3;
        }

        /* renamed from: newBuilder */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement m113683x3136c9db() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement();
        }

        /* renamed from: build */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement m113684x59bc66e() {
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: compareContent */
        public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement)) {
                return false;
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement gameAchievement = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement) fVar;
            return n51.f.a(this.f59679x3ba98eb8, gameAchievement.f59679x3ba98eb8) && n51.f.a(this.f59678x3ba750a6, gameAchievement.f59678x3ba750a6) && n51.f.a(this.f59680x96478a00, gameAchievement.f59680x96478a00) && n51.f.a(this.f59677x993583fc, gameAchievement.f59677x993583fc) && n51.f.a(this.f59681x2f15a79b, gameAchievement.f59681x2f15a79b);
        }

        /* renamed from: getDescription */
        public java.lang.String m113685x730bcac6() {
            return this.f59677x993583fc;
        }

        /* renamed from: getGameIcon */
        public java.lang.String m113686x1261f101() {
            return this.f59678x3ba750a6;
        }

        /* renamed from: getGameName */
        public java.lang.String m113687x12642f13() {
            return this.f59679x3ba98eb8;
        }

        /* renamed from: getGame_icon */
        public java.lang.String m113688x3b14c1f0() {
            return this.f59678x3ba750a6;
        }

        /* renamed from: getGame_name */
        public java.lang.String m113689x3b170002() {
            return this.f59679x3ba98eb8;
        }

        /* renamed from: getTitleIcon */
        public java.lang.String m113690x801b583b() {
            return this.f59680x96478a00;
        }

        /* renamed from: getTitleIconHd */
        public java.lang.String m113691xe6a63e97() {
            return this.f59681x2f15a79b;
        }

        /* renamed from: getTitle_icon */
        public java.lang.String m113692x848841f6() {
            return this.f59680x96478a00;
        }

        /* renamed from: getTitle_icon_hd */
        public java.lang.String m113693xec7563e5() {
            return this.f59681x2f15a79b;
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement m113694x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            mo11468x92b714fd(fVar.m75960xfb7e5820());
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: newInstance */
        public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement();
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        public final int op(int i17, java.lang.Object... objArr) {
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                java.lang.String str = this.f59679x3ba98eb8;
                if (str != null) {
                    fVar.j(1, str);
                }
                java.lang.String str2 = this.f59678x3ba750a6;
                if (str2 != null) {
                    fVar.j(2, str2);
                }
                java.lang.String str3 = this.f59680x96478a00;
                if (str3 != null) {
                    fVar.j(3, str3);
                }
                java.lang.String str4 = this.f59677x993583fc;
                if (str4 != null) {
                    fVar.j(4, str4);
                }
                java.lang.String str5 = this.f59681x2f15a79b;
                if (str5 != null) {
                    fVar.j(5, str5);
                }
                return 0;
            }
            if (i17 == 1) {
                java.lang.String str6 = this.f59679x3ba98eb8;
                int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
                java.lang.String str7 = this.f59678x3ba750a6;
                if (str7 != null) {
                    j17 += b36.f.j(2, str7);
                }
                java.lang.String str8 = this.f59680x96478a00;
                if (str8 != null) {
                    j17 += b36.f.j(3, str8);
                }
                java.lang.String str9 = this.f59677x993583fc;
                if (str9 != null) {
                    j17 += b36.f.j(4, str9);
                }
                java.lang.String str10 = this.f59681x2f15a79b;
                return str10 != null ? j17 + b36.f.j(5, str10) : j17;
            }
            if (i17 == 2) {
                c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
                for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                    if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                        aVar.b();
                    }
                }
                return 0;
            }
            if (i17 != 3) {
                return -1;
            }
            c36.a aVar2 = (c36.a) objArr[0];
            int intValue = ((java.lang.Integer) objArr[2]).intValue();
            if (intValue == 1) {
                this.f59679x3ba98eb8 = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 2) {
                this.f59678x3ba750a6 = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                this.f59680x96478a00 = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 4) {
                this.f59677x993583fc = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f59681x2f15a79b = aVar2.k(intValue);
            return 0;
        }

        /* renamed from: setDescription */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement m113696x9713e3a(java.lang.String str) {
            this.f59677x993583fc = str;
            return this;
        }

        /* renamed from: setGameIcon */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement m113697xd1a520d(java.lang.String str) {
            this.f59678x3ba750a6 = str;
            return this;
        }

        /* renamed from: setGameName */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement m113698xd1c901f(java.lang.String str) {
            this.f59679x3ba98eb8 = str;
            return this;
        }

        /* renamed from: setGame_icon */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement m113699x97688264(java.lang.String str) {
            this.f59678x3ba750a6 = str;
            return this;
        }

        /* renamed from: setGame_name */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement m113700x976ac076(java.lang.String str) {
            this.f59679x3ba98eb8 = str;
            return this;
        }

        /* renamed from: setTitleIcon */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement m113701xdc6f18af(java.lang.String str) {
            this.f59680x96478a00 = str;
            return this;
        }

        /* renamed from: setTitleIconHd */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement m113702x7d0bb20b(java.lang.String str) {
            this.f59681x2f15a79b = str;
            return this;
        }

        /* renamed from: setTitle_icon */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement m113703xb2ac9002(java.lang.String str) {
            this.f59680x96478a00 = str;
            return this;
        }

        /* renamed from: setTitle_icon_hd */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement m113704x7f4bca59(java.lang.String str) {
            this.f59681x2f15a79b = str;
            return this;
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement m113695x60f45402(byte[] bArr) {
            mo11468x92b714fd(bArr);
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: parseFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement mo11468x92b714fd(byte[] bArr) {
            return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement) super.mo11468x92b714fd(bArr);
        }
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d m113666xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d m113667x7c90cfc0() {
        return f59674xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d m113668x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d();
    }

    /* renamed from: addAllElementGameAchievements */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d m113669xb1633df2(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement> collection) {
        this.f59675x6b50ee51.addAll(collection);
        return this;
    }

    /* renamed from: addAllElementGame_achievements */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d m113670x63688415(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement> collection) {
        this.f59675x6b50ee51.addAll(collection);
        return this;
    }

    /* renamed from: addElementGameAchievements */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d m113671xce67c171(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement gameAchievement) {
        this.f59675x6b50ee51.add(gameAchievement);
        return this;
    }

    /* renamed from: addElementGame_achievements */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d m113672xe6f47076(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement gameAchievement) {
        this.f59675x6b50ee51.add(gameAchievement);
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d m113673x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d) && n51.f.a(this.f59675x6b50ee51, ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d) fVar).f59675x6b50ee51);
    }

    /* renamed from: getGameAchievements */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement> m113674x61bf03ac() {
        return this.f59675x6b50ee51;
    }

    /* renamed from: getGame_achievements */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement> m113675xbe85759b() {
        return this.f59675x6b50ee51;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d m113676x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.f59675x6b50ee51);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f59675x6b50ee51) + 0;
        }
        if (i17 == 2) {
            this.f59675x6b50ee51.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement gameAchievement = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement();
            if (bArr != null && bArr.length > 0) {
                gameAchievement.mo11468x92b714fd(bArr);
            }
            this.f59675x6b50ee51.add(gameAchievement);
        }
        return 0;
    }

    /* renamed from: setGameAchievements */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d m113678x5bb98b8(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement> linkedList) {
        this.f59675x6b50ee51 = linkedList;
        return this;
    }

    /* renamed from: setGame_achievements */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d m113679x9a1b820f(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d.GameAchievement> linkedList) {
        this.f59675x6b50ee51 = linkedList;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d m113677x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27365xe996f05d) super.mo11468x92b714fd(bArr);
    }
}
