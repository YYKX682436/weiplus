package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9;

/* renamed from: com.tencent.qqmusic.mediaplayer.perf.Reporters */
/* loaded from: classes13.dex */
public class C25404x6262d792 {
    /* renamed from: detail */
    public static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25401x58f18ffd.Visitor m94145xb06a1851(final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 c25316x94782396, final java.util.Map<java.lang.String, java.lang.String> map) {
        return new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25401x58f18ffd.Visitor() { // from class: com.tencent.qqmusic.mediaplayer.perf.Reporters.1
            @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25401x58f18ffd.Visitor
            /* renamed from: visitSpeedCheck */
            public void mo94127x6e6650ac(java.util.List<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25401x58f18ffd.SpeedCheck> list, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25401x58f18ffd.OverallInfo overallInfo) {
                long round = java.lang.Math.round(overallInfo.f45953x26df6427 / overallInfo.f45952xfb167105);
                double m93541x4b916df4 = ((com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396.this.m93541x4b916df4() * com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396.this.m93539xd13e6146()) * (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396.this.m93537xbc5bbb2c() != 1 ? 2 : 1)) / 1000.0d;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n============== Info start ==============\n");
                sb6.append("媒体文件信息:\n\t播放时间: ");
                sb6.append(new java.util.Date().toString());
                sb6.append("\n\t音频类型: ");
                sb6.append(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396.this.m93536xaa5357a().toString());
                sb6.append("\n\t文件采样率: ");
                sb6.append(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396.this.m93542xf6c809a0());
                sb6.append("\n\t播放采样率: ");
                sb6.append(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396.this.m93541x4b916df4());
                sb6.append("\n\t位深: ");
                sb6.append(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396.this.m93537xbc5bbb2c());
                sb6.append("\n\t声道数: ");
                sb6.append(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396.this.m93539xd13e6146());
                sb6.append("\n\t时长: ");
                sb6.append(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396.this.m93540x51e8b0a());
                sb6.append("\n\n整体性能\n\t总耗时 (ms): ");
                sb6.append(overallInfo.f45952xfb167105);
                sb6.append("\n\t播放PCM数据量 (byte): ");
                sb6.append(overallInfo.f45953x26df6427);
                sb6.append("\n\t总速度 (byte/ms): ");
                sb6.append(round);
                sb6.append(" (");
                sb6.append(java.lang.Math.round(round / m93541x4b916df4));
                sb6.append(" 倍于最低要求速度)\n\t最低要求速度 (byte/ms): ");
                sb6.append(m93541x4b916df4);
                sb6.append("\n\n额外信息:");
                for (java.util.Map.Entry entry : map.entrySet()) {
                    sb6.append("\n\t");
                    sb6.append((java.lang.String) entry.getKey());
                    sb6.append(": ");
                    sb6.append((java.lang.String) entry.getValue());
                }
                sb6.append("\n");
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25404x6262d792.m94146x9d8521ab(list, sb6, overallInfo.f45952xfb167105);
                sb6.append("============== Info end ==============");
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i("PERFORMANCE", sb6.toString());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: generateDetailedPerformance */
    public static void m94146x9d8521ab(java.util.List<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25401x58f18ffd.SpeedCheck> list, java.lang.StringBuilder sb6, long j17) {
        sb6.append("\n详细性能数据:\n");
        sb6.append(java.lang.String.format(java.util.Locale.getDefault(), "\t%15s%15s%15s%15s%15s", "名称", "平均速度(byte/ms)", "耗时(ms)", "数据量(byte)", "占总耗时比"));
        for (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25401x58f18ffd.SpeedCheck speedCheck : list) {
            sb6.append("\n");
            sb6.append(java.lang.String.format(java.util.Locale.getDefault(), "\t%15s%15.0f%15d%15d%13.2f", speedCheck.m94122xfb82e301(), java.lang.Double.valueOf(speedCheck.m94119xb5882b9c()), java.lang.Long.valueOf(speedCheck.m94124xaf166881()), java.lang.Long.valueOf(speedCheck.m94123x1cd27bf4()), java.lang.Double.valueOf(speedCheck.m94124xaf166881() / j17)));
        }
        sb6.append("\n");
    }
}
