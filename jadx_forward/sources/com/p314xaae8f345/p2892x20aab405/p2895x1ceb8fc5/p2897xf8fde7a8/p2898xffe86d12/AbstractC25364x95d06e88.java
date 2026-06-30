package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12;

/* renamed from: com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs */
/* loaded from: classes16.dex */
abstract class AbstractC25364x95d06e88 extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0 {

    /* renamed from: com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs$CharsetRecog_big5 */
    /* loaded from: classes16.dex */
    public static class CharsetRecog_big5 extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25364x95d06e88 {

        /* renamed from: commonChars */
        static int[] f45773x8bb638b2 = {41280, 41281, 41282, 41283, 41287, 41289, 41333, 41334, 42048, 42054, 42055, 42056, 42065, 42068, 42071, 42084, 42090, 42092, 42103, 42147, 42148, 42151, 42177, 42190, 42193, 42207, 42216, 42237, 42304, 42312, 42328, 42345, 42445, 42471, 42583, 42593, 42594, 42600, 42608, 42664, 42675, 42681, 42707, 42715, 42726, 42738, 42816, 42833, 42841, 42970, 43171, 43173, 43181, 43217, 43219, 43236, 43260, 43456, 43474, 43507, 43627, 43706, 43710, 43724, 43772, 44103, 44111, 44208, 44242, 44377, 44745, 45024, 45290, 45423, 45747, 45764, 45935, 46156, 46158, 46412, 46501, 46525, 46544, 46552, 46705, 47085, 47207, 47428, 47832, 47940, 48033, 48593, 49860, 50105, 50240, 50271};

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
        /* renamed from: getLanguage */
        public java.lang.String mo93933x1bacd0ce() {
            return "zh";
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25364x95d06e88, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
        /* renamed from: getName */
        public java.lang.String mo93925xfb82e301() {
            return "Big5";
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
        /* renamed from: match */
        public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9 mo93926x62dd9c5(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912 c25359xc8558912) {
            int m93930x62dd9c5 = m93930x62dd9c5(c25359xc8558912, f45773x8bb638b2);
            if (m93930x62dd9c5 == 0) {
                return null;
            }
            return new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9(c25359xc8558912, this, m93930x62dd9c5);
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25364x95d06e88
        /* renamed from: nextChar */
        public boolean mo93931x54dee0e9(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25364x95d06e88.iteratedChar iteratedchar, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912 c25359xc8558912) {
            iteratedchar.f45780x5c4d208 = false;
            int m93938x54deae9b = iteratedchar.m93938x54deae9b(c25359xc8558912);
            iteratedchar.f45778x5c9fb3bb = m93938x54deae9b;
            if (m93938x54deae9b < 0) {
                return false;
            }
            if (m93938x54deae9b > 127 && m93938x54deae9b != 255) {
                int m93938x54deae9b2 = iteratedchar.m93938x54deae9b(c25359xc8558912);
                if (m93938x54deae9b2 < 0) {
                    return false;
                }
                iteratedchar.f45778x5c9fb3bb = (iteratedchar.f45778x5c9fb3bb << 8) | m93938x54deae9b2;
                if (m93938x54deae9b2 < 64 || m93938x54deae9b2 == 127 || m93938x54deae9b2 == 255) {
                    iteratedchar.f45780x5c4d208 = true;
                }
            }
            return true;
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs$CharsetRecog_euc */
    /* loaded from: classes16.dex */
    public static abstract class CharsetRecog_euc extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25364x95d06e88 {

        /* renamed from: com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs$CharsetRecog_euc$CharsetRecog_euc_jp */
        /* loaded from: classes16.dex */
        public static class CharsetRecog_euc_jp extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25364x95d06e88.CharsetRecog_euc {

            /* renamed from: commonChars */
            static int[] f45774x8bb638b2 = {41377, 41378, 41379, 41382, 41404, 41418, 41419, 41430, 41431, 42146, 42148, 42150, 42152, 42154, 42155, 42156, 42157, 42159, 42161, 42163, 42165, 42167, 42169, 42171, 42173, 42175, 42176, 42177, 42179, 42180, 42182, 42183, 42184, 42185, 42186, 42187, 42190, 42191, 42192, 42206, 42207, 42209, 42210, 42212, 42216, 42217, 42218, 42219, 42220, 42223, 42226, 42227, 42402, 42403, 42404, 42406, 42407, 42410, 42413, 42415, 42416, 42419, 42421, 42423, 42424, 42425, 42431, 42435, 42438, 42439, 42440, 42441, 42443, 42448, 42453, 42454, 42455, 42462, 42464, 42465, 42469, 42473, 42474, 42475, 42476, 42477, 42483, 47273, 47572, 47854, 48072, 48880, 49079, 50410, 50940, 51133, 51896, 51955, 52188, 52689};

            @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
            /* renamed from: getLanguage */
            public java.lang.String mo93933x1bacd0ce() {
                return "ja";
            }

            @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25364x95d06e88, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
            /* renamed from: getName */
            public java.lang.String mo93925xfb82e301() {
                return "EUC-JP";
            }

            @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
            /* renamed from: match */
            public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9 mo93926x62dd9c5(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912 c25359xc8558912) {
                int m93930x62dd9c5 = m93930x62dd9c5(c25359xc8558912, f45774x8bb638b2);
                if (m93930x62dd9c5 == 0) {
                    return null;
                }
                return new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9(c25359xc8558912, this, m93930x62dd9c5);
            }
        }

        /* renamed from: com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs$CharsetRecog_euc$CharsetRecog_euc_kr */
        /* loaded from: classes16.dex */
        public static class CharsetRecog_euc_kr extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25364x95d06e88.CharsetRecog_euc {

            /* renamed from: commonChars */
            static int[] f45775x8bb638b2 = {45217, 45235, 45253, 45261, 45268, 45286, 45293, 45304, 45306, 45308, 45496, 45497, 45511, 45527, 45538, 45994, 46011, 46274, 46287, 46297, 46315, 46501, 46517, 46527, 46535, 46569, 46835, 47023, 47042, 47054, 47270, 47278, 47286, 47288, 47291, 47337, 47531, 47534, 47564, 47566, 47613, 47800, 47822, 47824, 47857, 48103, 48115, 48125, 48301, 48314, 48338, 48374, 48570, 48576, 48579, 48581, 48838, 48840, 48863, 48878, 48888, 48890, 49057, 49065, 49088, 49124, 49131, 49132, 49144, 49319, 49327, 49336, 49338, 49339, 49341, 49351, 49356, 49358, 49359, 49366, 49370, 49381, 49403, 49404, 49572, 49574, 49590, 49622, 49631, 49654, 49656, 50337, 50637, 50862, 51151, 51153, 51154, 51160, 51173, 51373};

            @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
            /* renamed from: getLanguage */
            public java.lang.String mo93933x1bacd0ce() {
                return "ko";
            }

            @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25364x95d06e88, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
            /* renamed from: getName */
            public java.lang.String mo93925xfb82e301() {
                return "EUC-KR";
            }

            @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
            /* renamed from: match */
            public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9 mo93926x62dd9c5(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912 c25359xc8558912) {
                int m93930x62dd9c5 = m93930x62dd9c5(c25359xc8558912, f45775x8bb638b2);
                if (m93930x62dd9c5 == 0) {
                    return null;
                }
                return new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9(c25359xc8558912, this, m93930x62dd9c5);
            }
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25364x95d06e88
        /* renamed from: nextChar */
        public boolean mo93931x54dee0e9(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25364x95d06e88.iteratedChar iteratedchar, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912 c25359xc8558912) {
            iteratedchar.f45780x5c4d208 = false;
            int m93938x54deae9b = iteratedchar.m93938x54deae9b(c25359xc8558912);
            iteratedchar.f45778x5c9fb3bb = m93938x54deae9b;
            if (m93938x54deae9b < 0) {
                iteratedchar.f45779x2f2382 = true;
            } else if (m93938x54deae9b > 141) {
                int m93938x54deae9b2 = iteratedchar.m93938x54deae9b(c25359xc8558912);
                iteratedchar.f45778x5c9fb3bb = (iteratedchar.f45778x5c9fb3bb << 8) | m93938x54deae9b2;
                if (m93938x54deae9b < 161 || m93938x54deae9b > 254) {
                    if (m93938x54deae9b == 142) {
                        if (m93938x54deae9b2 < 161) {
                            iteratedchar.f45780x5c4d208 = true;
                        }
                    } else if (m93938x54deae9b == 143) {
                        int m93938x54deae9b3 = iteratedchar.m93938x54deae9b(c25359xc8558912);
                        iteratedchar.f45778x5c9fb3bb = (iteratedchar.f45778x5c9fb3bb << 8) | m93938x54deae9b3;
                        if (m93938x54deae9b3 < 161) {
                            iteratedchar.f45780x5c4d208 = true;
                        }
                    }
                } else if (m93938x54deae9b2 < 161) {
                    iteratedchar.f45780x5c4d208 = true;
                }
            }
            return !iteratedchar.f45779x2f2382;
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs$CharsetRecog_gb_18030 */
    /* loaded from: classes16.dex */
    public static class CharsetRecog_gb_18030 extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25364x95d06e88 {

        /* renamed from: commonChars */
        static int[] f45776x8bb638b2 = {41377, 41378, 41379, 41380, 41392, 41393, 41457, 41459, 41889, 41900, 41914, 45480, 45496, 45502, 45755, 46025, 46070, 46323, 46525, 46532, 46563, 46767, 46804, 46816, 47010, 47016, 47037, 47062, 47069, 47284, 47327, 47350, 47531, 47561, 47576, 47610, 47613, 47821, 48039, 48086, 48097, 48122, 48316, 48347, 48382, 48588, 48845, 48861, 49076, 49094, 49097, 49332, 49389, 49611, 49883, 50119, 50396, 50410, 50636, 50935, 51192, 51371, 51403, 51413, 51431, 51663, 51706, 51889, 51893, 51911, 51920, 51926, 51957, 51965, 52460, 52728, 52906, 52932, 52946, 52965, 53173, 53186, 53206, 53442, 53445, 53456, 53460, 53671, 53930, 53938, 53941, 53947, 53972, 54211, 54224, 54269, 54466, 54490, 54754, 54992};

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
        /* renamed from: getLanguage */
        public java.lang.String mo93933x1bacd0ce() {
            return "zh";
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25364x95d06e88, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
        /* renamed from: getName */
        public java.lang.String mo93925xfb82e301() {
            return "GB18030";
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
        /* renamed from: match */
        public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9 mo93926x62dd9c5(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912 c25359xc8558912) {
            int m93930x62dd9c5 = m93930x62dd9c5(c25359xc8558912, f45776x8bb638b2);
            if (m93930x62dd9c5 == 0) {
                return null;
            }
            return new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9(c25359xc8558912, this, m93930x62dd9c5);
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25364x95d06e88
        /* renamed from: nextChar */
        public boolean mo93931x54dee0e9(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25364x95d06e88.iteratedChar iteratedchar, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912 c25359xc8558912) {
            int m93938x54deae9b;
            int m93938x54deae9b2;
            iteratedchar.f45780x5c4d208 = false;
            int m93938x54deae9b3 = iteratedchar.m93938x54deae9b(c25359xc8558912);
            iteratedchar.f45778x5c9fb3bb = m93938x54deae9b3;
            if (m93938x54deae9b3 < 0) {
                iteratedchar.f45779x2f2382 = true;
            } else if (m93938x54deae9b3 > 128) {
                int m93938x54deae9b4 = iteratedchar.m93938x54deae9b(c25359xc8558912);
                iteratedchar.f45778x5c9fb3bb = (iteratedchar.f45778x5c9fb3bb << 8) | m93938x54deae9b4;
                if (m93938x54deae9b3 >= 129 && m93938x54deae9b3 <= 254 && ((m93938x54deae9b4 < 64 || m93938x54deae9b4 > 126) && (m93938x54deae9b4 < 80 || m93938x54deae9b4 > 254))) {
                    if (m93938x54deae9b4 < 48 || m93938x54deae9b4 > 57 || (m93938x54deae9b = iteratedchar.m93938x54deae9b(c25359xc8558912)) < 129 || m93938x54deae9b > 254 || (m93938x54deae9b2 = iteratedchar.m93938x54deae9b(c25359xc8558912)) < 48 || m93938x54deae9b2 > 57) {
                        iteratedchar.f45780x5c4d208 = true;
                    } else {
                        iteratedchar.f45778x5c9fb3bb = m93938x54deae9b2 | (iteratedchar.f45778x5c9fb3bb << 16) | (m93938x54deae9b << 8);
                    }
                }
            }
            return !iteratedchar.f45779x2f2382;
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs$CharsetRecog_sjis */
    /* loaded from: classes16.dex */
    public static class CharsetRecog_sjis extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25364x95d06e88 {

        /* renamed from: commonChars */
        static int[] f45777x8bb638b2 = {33088, 33089, 33090, 33093, 33115, 33129, 33130, 33141, 33142, 33440, 33442, 33444, 33449, 33450, 33451, 33453, 33455, 33457, 33459, 33461, 33463, 33469, 33470, 33473, 33476, 33477, 33478, 33480, 33481, 33484, 33485, 33500, 33504, 33511, 33512, 33513, 33514, 33520, 33521, 33601, 33603, 33614, 33615, 33624, 33630, 33634, 33639, 33653, 33654, 33673, 33674, 33675, 33677, 33683, 36502, 37882, 38314};

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
        /* renamed from: getLanguage */
        public java.lang.String mo93933x1bacd0ce() {
            return "ja";
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25364x95d06e88, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
        /* renamed from: getName */
        public java.lang.String mo93925xfb82e301() {
            return "Shift_JIS";
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
        /* renamed from: match */
        public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9 mo93926x62dd9c5(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912 c25359xc8558912) {
            int m93930x62dd9c5 = m93930x62dd9c5(c25359xc8558912, f45777x8bb638b2);
            if (m93930x62dd9c5 == 0) {
                return null;
            }
            return new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9(c25359xc8558912, this, m93930x62dd9c5);
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25364x95d06e88
        /* renamed from: nextChar */
        public boolean mo93931x54dee0e9(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25364x95d06e88.iteratedChar iteratedchar, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912 c25359xc8558912) {
            iteratedchar.f45780x5c4d208 = false;
            int m93938x54deae9b = iteratedchar.m93938x54deae9b(c25359xc8558912);
            iteratedchar.f45778x5c9fb3bb = m93938x54deae9b;
            if (m93938x54deae9b < 0) {
                return false;
            }
            if (m93938x54deae9b > 127 && (m93938x54deae9b <= 160 || m93938x54deae9b > 223)) {
                int m93938x54deae9b2 = iteratedchar.m93938x54deae9b(c25359xc8558912);
                if (m93938x54deae9b2 < 0) {
                    return false;
                }
                iteratedchar.f45778x5c9fb3bb = (m93938x54deae9b << 8) | m93938x54deae9b2;
                if ((m93938x54deae9b2 < 64 || m93938x54deae9b2 > 127) && (m93938x54deae9b2 < 128 || m93938x54deae9b2 > 255)) {
                    iteratedchar.f45780x5c4d208 = true;
                }
            }
            return true;
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs$iteratedChar */
    /* loaded from: classes16.dex */
    public static class iteratedChar {

        /* renamed from: charValue */
        int f45778x5c9fb3bb = 0;

        /* renamed from: nextIndex */
        int f45781x47548d9f = 0;

        /* renamed from: error */
        boolean f45780x5c4d208 = false;

        /* renamed from: done */
        boolean f45779x2f2382 = false;

        /* renamed from: nextByte */
        public int m93938x54deae9b(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912 c25359xc8558912) {
            int i17 = this.f45781x47548d9f;
            if (i17 >= c25359xc8558912.f45760x4df95368) {
                this.f45779x2f2382 = true;
                return -1;
            }
            byte[] bArr = c25359xc8558912.f45759x33ea2708;
            this.f45781x47548d9f = i17 + 1;
            return bArr[i17] & 255;
        }

        /* renamed from: reset */
        public void m93939x6761d4f() {
            this.f45778x5c9fb3bb = 0;
            this.f45781x47548d9f = 0;
            this.f45780x5c4d208 = false;
            this.f45779x2f2382 = false;
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
    /* renamed from: getName */
    public abstract java.lang.String mo93925xfb82e301();

    /* renamed from: match */
    public int m93930x62dd9c5(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912 c25359xc8558912, int[] iArr) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25364x95d06e88.iteratedChar iteratedchar = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25364x95d06e88.iteratedChar();
        iteratedchar.m93939x6761d4f();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i27 = 0;
        while (mo93931x54dee0e9(iteratedchar, c25359xc8558912)) {
            i18++;
            if (iteratedchar.f45780x5c4d208) {
                i19++;
            } else {
                long j17 = iteratedchar.f45778x5c9fb3bb & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                if (j17 > 255) {
                    i17++;
                    if (iArr != null && java.util.Arrays.binarySearch(iArr, (int) j17) >= 0) {
                        i27++;
                    }
                }
            }
            if (i19 >= 2 && i19 * 5 >= i17) {
                return 0;
            }
        }
        int i28 = 10;
        if (i17 > 10 || i19 != 0) {
            int i29 = i19 * 20;
            if (i17 < i29) {
                return 0;
            }
            if (iArr != null) {
                return java.lang.Math.min((int) ((java.lang.Math.log(i27 + 1) * (90.0d / java.lang.Math.log(i17 / 4.0f))) + 10.0d), 100);
            }
            i28 = (i17 + 30) - i29;
            if (i28 > 100) {
                return 100;
            }
        } else if (i17 == 0 && i18 < 10) {
            return 0;
        }
        return i28;
    }

    /* renamed from: nextChar */
    public abstract boolean mo93931x54dee0e9(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25364x95d06e88.iteratedChar iteratedchar, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912 c25359xc8558912);
}
