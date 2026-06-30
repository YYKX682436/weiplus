package com.tencent.mm.mj_publisher.finder.movie_composing.audio.services;

/* loaded from: classes16.dex */
public class AudioChannels3aConfig {
    public int aecLevel;
    public int agcLevel;
    public int ansLevel;
    public float postgain;

    public AudioChannels3aConfig() {
        int i17 = com.tencent.mm.mj_publisher.finder.movie_composing.audio.services.AudioChannels3aLevel.LEVEL_0.value;
        this.aecLevel = i17;
        this.ansLevel = com.tencent.mm.mj_publisher.finder.movie_composing.audio.services.AudioChannels3aLevel.LEVEL_120.value;
        this.agcLevel = i17;
        this.postgain = 1.0f;
    }

    public com.tencent.mm.mj_publisher.finder.movie_composing.audio.services.AudioChannels3aLevel getAns3aLevel() {
        int i17 = this.ansLevel;
        com.tencent.mm.mj_publisher.finder.movie_composing.audio.services.AudioChannels3aLevel audioChannels3aLevel = com.tencent.mm.mj_publisher.finder.movie_composing.audio.services.AudioChannels3aLevel.LEVEL_120;
        if (i17 == audioChannels3aLevel.value) {
            return audioChannels3aLevel;
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.audio.services.AudioChannels3aLevel audioChannels3aLevel2 = com.tencent.mm.mj_publisher.finder.movie_composing.audio.services.AudioChannels3aLevel.LEVEL_100;
        if (i17 == audioChannels3aLevel2.value) {
            return audioChannels3aLevel2;
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.audio.services.AudioChannels3aLevel audioChannels3aLevel3 = com.tencent.mm.mj_publisher.finder.movie_composing.audio.services.AudioChannels3aLevel.LEVEL_60;
        if (i17 == audioChannels3aLevel3.value) {
            return audioChannels3aLevel3;
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.audio.services.AudioChannels3aLevel audioChannels3aLevel4 = com.tencent.mm.mj_publisher.finder.movie_composing.audio.services.AudioChannels3aLevel.LEVEL_30;
        return i17 == audioChannels3aLevel4.value ? audioChannels3aLevel4 : com.tencent.mm.mj_publisher.finder.movie_composing.audio.services.AudioChannels3aLevel.LEVEL_0;
    }
}
